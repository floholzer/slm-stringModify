package at.technikum.slmstringmodify;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    private static String lastModifiedWord;
    private static int lastModifiedWordLength;
    @GetMapping("/api/modify")
    public String modifyString(@RequestParam String string) {
        StringBuilder modifiedWord = new StringBuilder();
        boolean capitalizeNext = false;
        for (char c : string.toCharArray()) {
            if (Character.isLetter(c)) {
                if (capitalizeNext) {
                    modifiedWord.append(Character.toUpperCase(c));
                } else {
                    modifiedWord.append(Character.toLowerCase(c));
                }
                capitalizeNext = !capitalizeNext;
            } else {
                modifiedWord.append(c);
            }
        }
        lastModifiedWord = modifiedWord.toString();
        lastModifiedWordLength = lastModifiedWord.length();
        return lastModifiedWord;
    }
    @GetMapping("/api/lastModifiedWord")
    public String getLastModifiedWord() {
        return lastModifiedWord;
    }
    @GetMapping("/api/length")
    public int getLastModifiedWordLength() {
        return lastModifiedWordLength;
    }
}
