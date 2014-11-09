/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Adam Alyyan
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 *  including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software
 * is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package dto.staticdata.item;

public enum ItemListData {
    ALL("all"),
    COLLOQ("colloq"),
    CONSUME_ON_FULL("consumeOnFull"),
    CONSUMED("consumed"),
    DEPTH("depth"),
    FROM("from"),
    GOLD("gold"),
    GROUPS("groups"),
    HIDE_FROM_ALL("hideFromAll"),
    IMAGE("image"),
    IN_STORE("inStore"),
    INTO("into"),
    MAPS("maps"),
    REQUIRED_CHAMPION("requiredChampion"),
    SANITIZED_DESCRIPTION("sanitizedChampion"),
    SPECIAL_RECIPE("specialRecipe"),
    STACKS("stacks"),
    STATS("stats"),
    TAGS("tags"),
    TREE("tree");

    private final String value;

    ItemListData(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
