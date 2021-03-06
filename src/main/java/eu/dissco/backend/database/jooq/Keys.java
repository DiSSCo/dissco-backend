/*
 * This file is generated by jOOQ.
 */
package eu.dissco.backend.database.jooq;


import eu.dissco.backend.database.jooq.tables.Annotation;
import eu.dissco.backend.database.jooq.tables.DigitalSpecimen;
import eu.dissco.backend.database.jooq.tables.MediaObject;
import eu.dissco.backend.database.jooq.tables.OrganisationDo;
import eu.dissco.backend.database.jooq.tables.OrganisationDocument;
import eu.dissco.backend.database.jooq.tables.records.AnnotationRecord;
import eu.dissco.backend.database.jooq.tables.records.DigitalSpecimenRecord;
import eu.dissco.backend.database.jooq.tables.records.MediaObjectRecord;
import eu.dissco.backend.database.jooq.tables.records.OrganisationDoRecord;
import eu.dissco.backend.database.jooq.tables.records.OrganisationDocumentRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AnnotationRecord> ANNOTATION_PKEY = Internal.createUniqueKey(Annotation.ANNOTATION, DSL.name("annotation_pkey"), new TableField[] { Annotation.ANNOTATION.ID }, true);
    public static final UniqueKey<AnnotationRecord> TARGET_CREATOR = Internal.createUniqueKey(Annotation.ANNOTATION, DSL.name("target_creator"), new TableField[] { Annotation.ANNOTATION.TARGET, Annotation.ANNOTATION.CREATOR }, true);
    public static final UniqueKey<DigitalSpecimenRecord> DIGITAL_SPECIMEN_PKEY = Internal.createUniqueKey(DigitalSpecimen.DIGITAL_SPECIMEN, DSL.name("digital_specimen_pkey"), new TableField[] { DigitalSpecimen.DIGITAL_SPECIMEN.ID }, true);
    public static final UniqueKey<MediaObjectRecord> MEDIA_OBJECT_PKEY = Internal.createUniqueKey(MediaObject.MEDIA_OBJECT, DSL.name("media_object_pkey"), new TableField[] { MediaObject.MEDIA_OBJECT.ID }, true);
    public static final UniqueKey<OrganisationDoRecord> ORGANISATION_DO_PKEY = Internal.createUniqueKey(OrganisationDo.ORGANISATION_DO, DSL.name("organisation_do_pkey"), new TableField[] { OrganisationDo.ORGANISATION_DO.ID }, true);
    public static final UniqueKey<OrganisationDocumentRecord> ORGANISATION_DOCUMENT_PKEY = Internal.createUniqueKey(OrganisationDocument.ORGANISATION_DOCUMENT, DSL.name("organisation_document_pkey"), new TableField[] { OrganisationDocument.ORGANISATION_DOCUMENT.DOCUMENT_ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<MediaObjectRecord, DigitalSpecimenRecord> MEDIA_OBJECT__MEDIA_OBJECT_DIGITAL_SPECIMEN_FKEY = Internal.createForeignKey(MediaObject.MEDIA_OBJECT, DSL.name("media_object_digital_specimen_fkey"), new TableField[] { MediaObject.MEDIA_OBJECT.DIGITAL_SPECIMEN }, Keys.DIGITAL_SPECIMEN_PKEY, new TableField[] { DigitalSpecimen.DIGITAL_SPECIMEN.ID }, true);
    public static final ForeignKey<OrganisationDocumentRecord, OrganisationDoRecord> ORGANISATION_DOCUMENT__FK_ORGANISATION = Internal.createForeignKey(OrganisationDocument.ORGANISATION_DOCUMENT, DSL.name("fk_organisation"), new TableField[] { OrganisationDocument.ORGANISATION_DOCUMENT.ORGANISATION_ID }, Keys.ORGANISATION_DO_PKEY, new TableField[] { OrganisationDo.ORGANISATION_DO.ID }, true);
}
