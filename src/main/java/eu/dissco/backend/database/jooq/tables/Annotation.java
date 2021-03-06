/*
 * This file is generated by jOOQ.
 */
package eu.dissco.backend.database.jooq.tables;


import eu.dissco.backend.database.jooq.Keys;
import eu.dissco.backend.database.jooq.Public;
import eu.dissco.backend.database.jooq.tables.records.AnnotationRecord;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.JSONB;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Annotation extends TableImpl<AnnotationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.annotation</code>
     */
    public static final Annotation ANNOTATION = new Annotation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AnnotationRecord> getRecordType() {
        return AnnotationRecord.class;
    }

    /**
     * The column <code>public.annotation.id</code>.
     */
    public final TableField<AnnotationRecord, String> ID = createField(DSL.name("id"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.annotation.type</code>.
     */
    public final TableField<AnnotationRecord, String> TYPE = createField(DSL.name("type"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.annotation.body</code>.
     */
    public final TableField<AnnotationRecord, JSONB> BODY = createField(DSL.name("body"), SQLDataType.JSONB, this, "");

    /**
     * The column <code>public.annotation.target</code>.
     */
    public final TableField<AnnotationRecord, String> TARGET = createField(DSL.name("target"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.annotation.last_updated</code>.
     */
    public final TableField<AnnotationRecord, Instant> LAST_UPDATED = createField(DSL.name("last_updated"), SQLDataType.INSTANT.nullable(false), this, "");

    /**
     * The column <code>public.annotation.creator</code>.
     */
    public final TableField<AnnotationRecord, String> CREATOR = createField(DSL.name("creator"), SQLDataType.CLOB, this, "");

    private Annotation(Name alias, Table<AnnotationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Annotation(Name alias, Table<AnnotationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.annotation</code> table reference
     */
    public Annotation(String alias) {
        this(DSL.name(alias), ANNOTATION);
    }

    /**
     * Create an aliased <code>public.annotation</code> table reference
     */
    public Annotation(Name alias) {
        this(alias, ANNOTATION);
    }

    /**
     * Create a <code>public.annotation</code> table reference
     */
    public Annotation() {
        this(DSL.name("annotation"), null);
    }

    public <O extends Record> Annotation(Table<O> child, ForeignKey<O, AnnotationRecord> key) {
        super(child, key, ANNOTATION);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<AnnotationRecord> getPrimaryKey() {
        return Keys.ANNOTATION_PKEY;
    }

    @Override
    public List<UniqueKey<AnnotationRecord>> getKeys() {
        return Arrays.<UniqueKey<AnnotationRecord>>asList(Keys.ANNOTATION_PKEY, Keys.TARGET_CREATOR);
    }

    @Override
    public Annotation as(String alias) {
        return new Annotation(DSL.name(alias), this);
    }

    @Override
    public Annotation as(Name alias) {
        return new Annotation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Annotation rename(String name) {
        return new Annotation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Annotation rename(Name name) {
        return new Annotation(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, JSONB, String, Instant, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
