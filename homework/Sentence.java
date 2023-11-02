package homework;

public class Sentence {
    public Word[] words;

    public Sentence(int size){
        words=new Word[size];
    }
    public boolean isValid(){
        if (words.length<1){
            return false;
        }
        int verb_num=0;
        for (int k=0;k<words.length;k++){

            if (words[k].type.equals(Word.Type.VERB)){
                verb_num++;
            }
            else if (words[k].type.equals(Word.Type.NOUN)){
                if (k+1<=words.length-1&&words[k+1].type!= Word.Type.VERB) {
                    return false;
                }
            }
            else if (words[k].type.equals(Word.Type.ADJECTIVE)){
                if (k< words.length-1&& words[k+1].type== Word.Type.VERB){
                    return false;
                }
            }


            if (words[words.length-1].type.equals(Word.Type.ADJECTIVE)){
                return false;
            }

        }
        if (verb_num!=1){
            return false;
        }
        return true;
    }
    public static class Word{
        String value;
        Type type;
        public enum Type{
            NOUN, ADJECTIVE,VERB
        };
        Word(String value, Type type){
            this.type=type;
            this.value=value;
        }
    }

}
