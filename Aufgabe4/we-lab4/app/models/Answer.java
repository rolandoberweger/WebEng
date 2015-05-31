package models;




/**
 * Represents an answer which is stored in the DB
 */

@javax.persistence.NamedQueries({
        @javax.persistence.NamedQuery(name = "findAll", query = "SELECT s FROM Answer s"),
        @javax.persistence.NamedQuery(name = "findById", query = "SELECT s FROM Answer s WHERE s.id = :id"),
        @javax.persistence.NamedQuery(name = "deleteAll", query = "DELETE FROM Answer")
})
@javax.persistence.Entity
public class Answer extends BaseEntity {


    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    private Long id;

    private String textDE;
    private String textEN;

    private Boolean correctAnswer;

    @javax.persistence.ManyToOne(cascade = javax.persistence.CascadeType.ALL)
    private Question question;

    public Answer() {
    }

    /**
     * Set the text attribute based on the given language. Default to English if no or an invalid language is passed
     * @param name
     * @param lang
     */
    public void setText(String name, String lang) {
        if ("de".equalsIgnoreCase(lang)) {
            this.textDE = name;
        }
        else {
            this.textEN = name;
        }
    }

    /**
     * Get the text attribute based on the given language. Default to English if no or an invalid language is passed
     * @param lang
     * @return
     */
    public String getText(String lang) {
        if ("de".equalsIgnoreCase(lang)) {
            return this.textDE;
        }
        else {
            return this.textEN;
        }
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getTextDE() {
        return textDE;
    }

    public void setTextDE(String textDE) {
        this.textDE = textDE;
    }

    public String getTextEN() {
        return textEN;
    }

    public void setTextEN(String textEN) {
        this.textEN = textEN;
    }

    public Boolean getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Boolean isWrong() {
        return !correctAnswer;
    }

    public Boolean isRight() {
        return correctAnswer;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
