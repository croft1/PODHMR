package devicroft.podhmr;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by m on 04-Mar-17.
 */

public class DbHelper extends SQLiteOpenHelper {

    private static final String TAG = "DBHELPER";
    public static final String DATABASE_NAME = "PODHMR";
    public static final int dbVersionNumber = 1;
    public static final String TABLENAME_REFERRAL = "REFERRAL";
    public static final String TABLENAME_PATIENT = "PATIENT";
    public static final String TABLENAME_GP = "GP";
    public static final String TABLENAME_PHARMACIST = "PHARMACIST";

    //REFERRAL
    public static final String RCOL_ID = "r_id";
    public static final String RCOL_FK_PATIENT_ID = "fk_patient_id";
    public static final String RCOL_FK_PHARMACIST_ID = "fk_pharmacist_id";
    public static final String RCOL_DISCHARGE_IN_FOUR_WEEKS = "discharge_in_four_weeks";
    public static final String RCOL_CHANGE_TO_MED_IN_LAST_THREE_MONTHS = "change_to_med_in_last_three_months";
    public static final String RCOL_CHANGE_TO_MED_CONDITION = "change_to_med_condition";
    public static final String RCOL_HIGH_RISK_MEDICATION = "high_risk_medication";
    public static final String RCOL_DRUG_REACTION_SYMPTOM = "drug_reaction_symptom";
    public static final String RCOL_NOT_RESPONDING_TO_MEDS = "not_responding_to_meds";
    public static final String RCOL_NON_COMPLIANCE = "non_compliance";
    public static final String RCOL_INABILITY_TO_MANAGE_PERSONAL_MEDICATIONS = "inability_to_manage_personal_medications";
        //end of  booleans
    public static final String RCOL_REFERRAL_REASON = "referral_reason";
    public static final String RCOL_ISSUES_ON_MED_EFFECTIVENESS = "issues_on_med_effectiveness";
    public static final String RCOL_PATIENT_WEIGHT = "patient_weight";
    public static final String RCOL_PATIENT_HEIGHT = "patient_height";
    public static final String RCOL_VACCINATION_STATUS = "vaccination_status";
    public static final String RCOL_MED_AID_TYPE = "med_aid_type"; //like containers
    public static final String RCOL_CURRENT_MED_LIST = "current_med_list";
    public static final String RCOL_CURRENT_CONDITIONS = "current_conditions";
    public static final String RCOL_RELEVANT_LAB_RESULTS = "relevant_lab_results";
    public static final String RCOL_OTHER_NOTES = "other_notes";

    //PHARMACIST
    public static final String PHCOL_ID = "ph_id";
    public static final String PHCOL_REG_AHPRA = "reg_ahpra";
    public static final String PHCOL_PHARM_APPROV_NUM = "pharm_approv_num";
    public static final String PHCOL_NAME = "name";
    public static final String PHCOL_EMAIL = "email";
    public static final String PHCOL_HOME_PHARM_LAT = "home_pharm_lat";
    public static final String PHCOL_HOME_PHARM_LNG = "home_pharm_lng";

    //PATIENT
    public static final String PACOL_ID = "pa_id";
    public static final String PACOL_FULLNAME = "full_name";
    public static final String PACOL_DOB = "dob";
    public static final String PACOL_MEDICARE_NUM = "medicare_num";
    public static final String PACOL_ADDRESS = "address";
    public static final String PACOL_PHONE = "phone";
    public static final String PACOL_REGULAR_PHARMACY_NAME = "regular_pharmacy";
    public static final String PACOL_ALLERGIES = "allergies";

    //GP
    public static final String GPCOL_ID = "gp_id";
    public static final String GPCOL_NAME = "name";
    public static final String GPCOL_REG_AHPRA = "reg_ahpra";
    public static final String GPCOL_PROVIDER_NUM = "provider_num";
    public static final String GPCOL_EMAIL = "email";
    public static final String GPCOL_QUALIFICATIONS = "qualifications";

    //CREATE STATEMENTS
    private static final String CREATE_GP_TABLE =
            "CREATE TABLE " + TABLENAME_GP + "(" +
                    GPCOL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                    GPCOL_NAME + " TEXT NOT NULL, " +
                    GPCOL_REG_AHPRA + " TEXT NOT NULL, " +
                    GPCOL_PROVIDER_NUM + " TEXT NOT NULL, " +
                    GPCOL_EMAIL + " TEXT NOT NULL, " +
                    GPCOL_QUALIFICATIONS + " TEXT NOT NULL" +
                    ");";

    private static final String CREATE_PA_TABLE =
            "CREATE TABLE " + TABLENAME_PATIENT + "(" +
                    PACOL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                    PACOL_ADDRESS + " TEXT NOT NULL, " +
                    PACOL_ALLERGIES + " TEXT NOT NULL, " +
                    PACOL_DOB + " TEXT NOT NULL, " +
                    PACOL_FULLNAME + " TEXT NOT NULL, " +
                    PACOL_MEDICARE_NUM  + " TEXT NOT NULL, " +
                    PACOL_PHONE + " TEXT NOT NULL, " +
                    PACOL_REGULAR_PHARMACY_NAME + " TEXT NOT NULL" +
                    ");";

    private static final String CREATE_PH_TABLE =
            "CREATE TABLE " + TABLENAME_PHARMACIST + "(" +
                    PHCOL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                    PHCOL_NAME + " TEXT NOT NULL, " +
                    PHCOL_EMAIL + " TEXT NOT NULL, " +
                    PHCOL_HOME_PHARM_LAT + " TEXT NOT NULL, " +
                    PHCOL_HOME_PHARM_LNG + " TEXT NOT NULL, " +
                    PHCOL_PHARM_APPROV_NUM  + " TEXT NOT NULL, " +
                    PHCOL_REG_AHPRA + " TEXT NOT NULL" +
                    ");";

    private static final String CREATE_REFERRAL_TABLE =
            "CREATE TABLE " + TABLENAME_REFERRAL + "(" +
                    PACOL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                    PACOL_ADDRESS + " TEXT NOT NULL, " +
                    PACOL_ALLERGIES + " TEXT NOT NULL, " +
                    PACOL_DOB + " TEXT NOT NULL, " +
                    PACOL_FULLNAME + " TEXT NOT NULL, " +
                    PACOL_MEDICARE_NUM  + " TEXT NOT NULL, " +
                    PACOL_PHONE + " TEXT NOT NULL, " +
                    PACOL_REGULAR_PHARMACY_NAME + " TEXT NOT NULL" +
                    ");";









    public DbHelper(Context context){
        super(context, DATABASE_NAME, null, dbVersionNumber);
        Log.d(TAG, "db created");
    }

    public DbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public DbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }



}
