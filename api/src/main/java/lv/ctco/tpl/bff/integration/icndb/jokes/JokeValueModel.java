package lv.ctco.tpl.bff.integration.icndb.jokes;

import lombok.Getter;

import java.util.List;

@Getter
public class JokeValueModel {
    String id;
    String joke;
    List<String> categories;
}
