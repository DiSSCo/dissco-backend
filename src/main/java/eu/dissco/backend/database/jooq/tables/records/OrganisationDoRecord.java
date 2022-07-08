/*
 * This file is generated by jOOQ.
 */
package eu.dissco.backend.database.jooq.tables.records;


import eu.dissco.backend.database.jooq.tables.OrganisationDo;

import org.jooq.Field;
import org.jooq.JSONB;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrganisationDoRecord extends UpdatableRecordImpl<OrganisationDoRecord> implements Record7<String, String, String, String, String, String, JSONB> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.organisation_do.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.organisation_do.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.organisation_do.organisation_name</code>.
     */
    public void setOrganisationName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.organisation_do.organisation_name</code>.
     */
    public String getOrganisationName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.organisation_do.organisation_code</code>.
     */
    public void setOrganisationCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.organisation_do.organisation_code</code>.
     */
    public String getOrganisationCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.organisation_do.city</code>.
     */
    public void setCity(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.organisation_do.city</code>.
     */
    public String getCity() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.organisation_do.country</code>.
     */
    public void setCountry(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.organisation_do.country</code>.
     */
    public String getCountry() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.organisation_do.country_code</code>.
     */
    public void setCountryCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.organisation_do.country_code</code>.
     */
    public String getCountryCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.organisation_do.data</code>.
     */
    public void setData(JSONB value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.organisation_do.data</code>.
     */
    public JSONB getData() {
        return (JSONB) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, String, JSONB> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, String, String, String, String, JSONB> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return OrganisationDo.ORGANISATION_DO.ID;
    }

    @Override
    public Field<String> field2() {
        return OrganisationDo.ORGANISATION_DO.ORGANISATION_NAME;
    }

    @Override
    public Field<String> field3() {
        return OrganisationDo.ORGANISATION_DO.ORGANISATION_CODE;
    }

    @Override
    public Field<String> field4() {
        return OrganisationDo.ORGANISATION_DO.CITY;
    }

    @Override
    public Field<String> field5() {
        return OrganisationDo.ORGANISATION_DO.COUNTRY;
    }

    @Override
    public Field<String> field6() {
        return OrganisationDo.ORGANISATION_DO.COUNTRY_CODE;
    }

    @Override
    public Field<JSONB> field7() {
        return OrganisationDo.ORGANISATION_DO.DATA;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getOrganisationName();
    }

    @Override
    public String component3() {
        return getOrganisationCode();
    }

    @Override
    public String component4() {
        return getCity();
    }

    @Override
    public String component5() {
        return getCountry();
    }

    @Override
    public String component6() {
        return getCountryCode();
    }

    @Override
    public JSONB component7() {
        return getData();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getOrganisationName();
    }

    @Override
    public String value3() {
        return getOrganisationCode();
    }

    @Override
    public String value4() {
        return getCity();
    }

    @Override
    public String value5() {
        return getCountry();
    }

    @Override
    public String value6() {
        return getCountryCode();
    }

    @Override
    public JSONB value7() {
        return getData();
    }

    @Override
    public OrganisationDoRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public OrganisationDoRecord value2(String value) {
        setOrganisationName(value);
        return this;
    }

    @Override
    public OrganisationDoRecord value3(String value) {
        setOrganisationCode(value);
        return this;
    }

    @Override
    public OrganisationDoRecord value4(String value) {
        setCity(value);
        return this;
    }

    @Override
    public OrganisationDoRecord value5(String value) {
        setCountry(value);
        return this;
    }

    @Override
    public OrganisationDoRecord value6(String value) {
        setCountryCode(value);
        return this;
    }

    @Override
    public OrganisationDoRecord value7(JSONB value) {
        setData(value);
        return this;
    }

    @Override
    public OrganisationDoRecord values(String value1, String value2, String value3, String value4, String value5, String value6, JSONB value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrganisationDoRecord
     */
    public OrganisationDoRecord() {
        super(OrganisationDo.ORGANISATION_DO);
    }

    /**
     * Create a detached, initialised OrganisationDoRecord
     */
    public OrganisationDoRecord(String id, String organisationName, String organisationCode, String city, String country, String countryCode, JSONB data) {
        super(OrganisationDo.ORGANISATION_DO);

        setId(id);
        setOrganisationName(organisationName);
        setOrganisationCode(organisationCode);
        setCity(city);
        setCountry(country);
        setCountryCode(countryCode);
        setData(data);
    }
}
