/*
 * This file is generated by jOOQ.
 */
package database.generated.tables;


import database.generated.Indexes;
import database.generated.Keys;
import database.generated.Public;
import database.generated.tables.records.SectionsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sections extends TableImpl<SectionsRecord> {

    private static final long serialVersionUID = 605364202;

    /**
     * The reference instance of <code>public.sections</code>
     */
    public static final Sections SECTIONS = new Sections();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SectionsRecord> getRecordType() {
        return SectionsRecord.class;
    }

    /**
     * The column <code>public.sections.id</code>.
     */
    public final TableField<SectionsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('sections_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.sections.registration_number</code>.
     */
    public final TableField<SectionsRecord, Integer> REGISTRATION_NUMBER = createField("registration_number", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.sections.course_id</code>.
     */
    public final TableField<SectionsRecord, Integer> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.sections.section_code</code>.
     */
    public final TableField<SectionsRecord, String> SECTION_CODE = createField("section_code", org.jooq.impl.SQLDataType.VARCHAR(5).nullable(false), this, "");

    /**
     * The column <code>public.sections.instructor</code>.
     */
    public final TableField<SectionsRecord, String> INSTRUCTOR = createField("instructor", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.sections.section_type</code>.
     */
    public final TableField<SectionsRecord, Integer> SECTION_TYPE = createField("section_type", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.sections.section_status</code>.
     */
    public final TableField<SectionsRecord, Integer> SECTION_STATUS = createField("section_status", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.sections.associated_with</code>.
     */
    public final TableField<SectionsRecord, Integer> ASSOCIATED_WITH = createField("associated_with", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.sections.waitlist_total</code>.
     */
    public final TableField<SectionsRecord, Integer> WAITLIST_TOTAL = createField("waitlist_total", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.sections.section_name</code>.
     */
    public final TableField<SectionsRecord, String> SECTION_NAME = createField("section_name", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>public.sections.min_units</code>.
     */
    public final TableField<SectionsRecord, Double> MIN_UNITS = createField("min_units", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.sections.max_units</code>.
     */
    public final TableField<SectionsRecord, Double> MAX_UNITS = createField("max_units", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.sections.campus</code>.
     */
    public final TableField<SectionsRecord, String> CAMPUS = createField("campus", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.sections.description</code>.
     */
    public final TableField<SectionsRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.sections.instruction_mode</code>.
     */
    public final TableField<SectionsRecord, String> INSTRUCTION_MODE = createField("instruction_mode", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>public.sections.grading</code>.
     */
    public final TableField<SectionsRecord, String> GRADING = createField("grading", org.jooq.impl.SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>public.sections.room_number</code>.
     */
    public final TableField<SectionsRecord, String> ROOM_NUMBER = createField("room_number", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>public.sections.prerequisites</code>.
     */
    public final TableField<SectionsRecord, String> PREREQUISITES = createField("prerequisites", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>public.sections</code> table reference
     */
    public Sections() {
        this(DSL.name("sections"), null);
    }

    /**
     * Create an aliased <code>public.sections</code> table reference
     */
    public Sections(String alias) {
        this(DSL.name(alias), SECTIONS);
    }

    /**
     * Create an aliased <code>public.sections</code> table reference
     */
    public Sections(Name alias) {
        this(alias, SECTIONS);
    }

    private Sections(Name alias, Table<SectionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sections(Name alias, Table<SectionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Sections(Table<O> child, ForeignKey<O, SectionsRecord> key) {
        super(child, key, SECTIONS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SECTION_IDX, Indexes.SECTIONS_ASSOCIATED_WITH, Indexes.SECTIONS_ID_KEY, Indexes.SECTIONS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SectionsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SECTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SectionsRecord> getPrimaryKey() {
        return Keys.SECTIONS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SectionsRecord>> getKeys() {
        return Arrays.<UniqueKey<SectionsRecord>>asList(Keys.SECTIONS_ID_KEY, Keys.SECTIONS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sections as(String alias) {
        return new Sections(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sections as(Name alias) {
        return new Sections(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Sections rename(String name) {
        return new Sections(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Sections rename(Name name) {
        return new Sections(name, null);
    }
}
