package devicroft.podhmr.models;

/**
 * Created by m on 04-Mar-17.
 */

public class PatientReferral {

    Patient patient;
    Pharmacist commissionedPharmacist;

    boolean dischargedInLast4Weeks;
    boolean changeToMedInLast3Months;
    boolean changeToMedCondition;
    boolean highRiskMedication;
    boolean drugReactionSymptom;
    boolean notRespondingToMeds;
    boolean nonCompliance;
    boolean inabilityToManagePersonalMedications;

    String referralReason;
    String issuesOnMedEffectiveness;
    double patientWeight;
    double patientHeight;
    String vaccinationStatus;
    String medAidType; //like containers
    String currentMedList;
    String currentConditions;
    String relevantLabResults; //can be null
    String otherNotes;

    public PatientReferral(Patient patient) {
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public boolean isDischargedInLast4Weeks() {
        return dischargedInLast4Weeks;
    }

    public void setDischargedInLast4Weeks(boolean dischargedInLast4Weeks) {
        this.dischargedInLast4Weeks = dischargedInLast4Weeks;
    }

    public boolean isChangeToMedInLast3Months() {
        return changeToMedInLast3Months;
    }

    public void setChangeToMedInLast3Months(boolean changeToMedInLast3Months) {
        this.changeToMedInLast3Months = changeToMedInLast3Months;
    }

    public boolean isChangeToMedCondition() {
        return changeToMedCondition;
    }

    public void setChangeToMedCondition(boolean changeToMedCondition) {
        this.changeToMedCondition = changeToMedCondition;
    }

    public boolean isHighRiskMedication() {
        return highRiskMedication;
    }

    public void setHighRiskMedication(boolean highRiskMedication) {
        this.highRiskMedication = highRiskMedication;
    }

    public boolean isDrugReactionSymptom() {
        return drugReactionSymptom;
    }

    public void setDrugReactionSymptom(boolean drugReactionSymptom) {
        this.drugReactionSymptom = drugReactionSymptom;
    }

    public boolean isNotRespondingToMeds() {
        return notRespondingToMeds;
    }

    public void setNotRespondingToMeds(boolean notRespondingToMeds) {
        this.notRespondingToMeds = notRespondingToMeds;
    }

    public boolean isNonCompliance() {
        return nonCompliance;
    }

    public void setNonCompliance(boolean nonCompliance) {
        this.nonCompliance = nonCompliance;
    }

    public boolean isInabilityToManagePersonalMedications() {
        return inabilityToManagePersonalMedications;
    }

    public void setInabilityToManagePersonalMedications(boolean inabilityToManagePersonalMedications) {
        this.inabilityToManagePersonalMedications = inabilityToManagePersonalMedications;
    }

    public String getReferralReason() {
        return referralReason;
    }

    public void setReferralReason(String referralReason) {
        this.referralReason = referralReason;
    }

    public String getIssuesOnMedEffectiveness() {
        return issuesOnMedEffectiveness;
    }

    public void setIssuesOnMedEffectiveness(String issuesOnMedEffectiveness) {
        this.issuesOnMedEffectiveness = issuesOnMedEffectiveness;
    }

    public double getPatientWeight() {
        return patientWeight;
    }

    public void setPatientWeight(double patientWeight) {
        this.patientWeight = patientWeight;
    }

    public double getPatientHeight() {
        return patientHeight;
    }

    public void setPatientHeight(double patientHeight) {
        this.patientHeight = patientHeight;
    }

    public String getVaccinationStatus() {
        return vaccinationStatus;
    }

    public void setVaccinationStatus(String vaccinationStatus) {
        this.vaccinationStatus = vaccinationStatus;
    }

    public String getMedAidType() {
        return medAidType;
    }

    public void setMedAidType(String medAidType) {
        this.medAidType = medAidType;
    }

    public String getCurrentMedList() {
        return currentMedList;
    }

    public void setCurrentMedList(String currentMedList) {
        this.currentMedList = currentMedList;
    }

    public String getCurrentConditions() {
        return currentConditions;
    }

    public void setCurrentConditions(String currentConditions) {
        this.currentConditions = currentConditions;
    }

    public String getRelevantLabResults() {
        return relevantLabResults;
    }

    public void setRelevantLabResults(String relevantLabResults) {
        this.relevantLabResults = relevantLabResults;
    }

    public String getOtherNotes() {
        return otherNotes;
    }

    public void setOtherNotes(String otherNotes) {
        this.otherNotes = otherNotes;
    }
}
