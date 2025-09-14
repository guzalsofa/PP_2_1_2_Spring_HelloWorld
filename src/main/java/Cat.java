import java.util.Objects;

public class Cat {
    private String voice;

    public String getVoice() {
        return voice;
    }
    public void setVoice(String voice) {
        this.voice = voice;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass());
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(getVoice());
    }
}
