package cn.beijing.ssfh.entity;

public class StudyParts {
    private Integer studyPartsId;

    private Integer productionId;

    private String phaseName;

    private Integer phaseDuration;

    public Integer getStudyPartsId() {
        return studyPartsId;
    }

    public void setStudyPartsId(Integer studyPartsId) {
        this.studyPartsId = studyPartsId;
    }

    public Integer getProductionId() {
        return productionId;
    }

    public void setProductionId(Integer productionId) {
        this.productionId = productionId;
    }

    public String getPhaseName() {
        return phaseName;
    }

    public void setPhaseName(String phaseName) {
        this.phaseName = phaseName == null ? null : phaseName.trim();
    }

    public Integer getPhaseDuration() {
        return phaseDuration;
    }

    public void setPhaseDuration(Integer phaseDuration) {
        this.phaseDuration = phaseDuration;
    }
}