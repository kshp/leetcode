package com.pk.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class _30_SubstringWithConcatenationOfAllWordsTest {

    private static String s1 = "barfoothefoobarman";
    private static String[] words1 = {"foo", "bar"};
    private static List<Integer> result1 = Arrays.asList(0, 9);

    private static String s2 = "wordgoodstudentgoodword";
    private static String[] words2 = {"word", "student"};
    private static List<Integer> result2 = Collections.emptyList();

    private static String s3 = "a";
    private static String[] words3 = {"a", "a"};
    private static List<Integer> result3 = Collections.emptyList();

    private static String s4 = "barfoofoobarthefoobarman";
    private static String[] words4 = {"bar", "foo", "the"};
    private static List<Integer> result4 = Arrays.asList(6, 9, 12);

    private static String s5 = "aaaaaaaa";
    private static String[] words5 = {"aa", "aa", "aa"};
    private static List<Integer> result5 = Arrays.asList(0, 2, 1);

    private static String s6 = "abababab";
    private static String[] words6 = {"ab","ba"};
    private static List<Integer> result6 = Collections.emptyList();

    private static String s7 = "pjzkrkevzztxductzzxmxsvwjkxpvukmfjywwetvfnujhweiybwvvsrfequzkhossmootkmyxgjgfordrpapjuunmqnxxdrqrfgkrsjqbszgiqlcfnrpjlcwdrvbumtotzylshdvccdmsqoadfrpsvnwpizlwszrtyclhgilklydbmfhuywotjmktnwrfvizvnmfvvqfiokkdprznnnjycttprkxpuykhmpchiksyucbmtabiqkisgbhxngmhezrrqvayfsxauampdpxtafniiwfvdufhtwajrbkxtjzqjnfocdhekumttuqwovfjrgulhekcpjszyynadxhnttgmnxkduqmmyhzfnjhducesctufqbumxbamalqudeibljgbspeotkgvddcwgxidaiqcvgwykhbysjzlzfbupkqunuqtraxrlptivshhbihtsigtpipguhbhctcvubnhqipncyxfjebdnjyetnlnvmuxhzsdahkrscewabejifmxombiamxvauuitoltyymsarqcuuoezcbqpdaprxmsrickwpgwpsoplhugbikbkotzrtqkscekkgwjycfnvwfgdzogjzjvpcvixnsqsxacfwndzvrwrycwxrcismdhqapoojegggkocyrdtkzmiekhxoppctytvphjynrhtcvxcobxbcjjivtfjiwmduhzjokkbctweqtigwfhzorjlkpuuliaipbtfldinyetoybvugevwvhhhweejogrghllsouipabfafcxnhukcbtmxzshoyyufjhzadhrelweszbfgwpkzlwxkogyogutscvuhcllphshivnoteztpxsaoaacgxyaztuixhunrowzljqfqrahosheukhahhbiaxqzfmmwcjxountkevsvpbzjnilwpoermxrtlfroqoclexxisrdhvfsindffslyekrzwzqkpeocilatftymodgztjgybtyheqgcpwogdcjlnlesefgvimwbxcbzvaibspdjnrpqtyeilkcspknyylbwndvkffmzuriilxagyerjptbgeqgebiaqnvdubrtxibhvakcyotkfonmseszhczapxdlauexehhaireihxsplgdgmxfvaevrbadbwjbdrkfbbjjkgcztkcbwagtcnrtqryuqixtzhaakjlurnumzyovawrcjiwabuwretmdamfkxrgqgcdgbrdbnugzecbgyxxdqmisaqcyjkqrntxqmdrczxbebemcblftxplafnyoxqimkhcykwamvdsxjezkpgdpvopddptdfbprjustquhlazkjfluxrzopqdstulybnqvyknrchbphcarknnhhovweaqawdyxsqsqahkepluypwrzjegqtdoxfgzdkydeoxvrfhxusrujnmjzqrrlxglcmkiykldbiasnhrjbjekystzilrwkzhontwmehrfsrzfaqrbbxncphbzuuxeteshyrveamjsfiaharkcqxefghgceeixkdgkuboupxnwhnfigpkwnqdvzlydpidcljmflbccarbiegsmweklwngvygbqpescpeichmfidgsjmkvkofvkuehsmkkbocgejoiqcnafvuokelwuqsgkyoekaroptuvekfvmtxtqshcwsztkrzwrpabqrrhnlerxjojemcxel";
    private static String[] words7 = {"dhvf","sind","ffsl","yekr","zwzq","kpeo","cila","tfty","modg","ztjg","ybty","heqg","cpwo","gdcj","lnle","sefg","vimw","bxcb"};
    private static List<Integer> result7 = Arrays.asList(935);


    @Test
    public void getCombination() {
        List<Integer> actualResult = _30_SubstringWithConcatenationOfAllWords.findSubstring(s1, words1);
        assertThat(actualResult, is(equalTo(result1)));

        actualResult = _30_SubstringWithConcatenationOfAllWords.findSubstring(s2, words2);
        assertThat(actualResult, is(equalTo(result2)));

        actualResult = _30_SubstringWithConcatenationOfAllWords.findSubstring(s3, words3);
        assertThat(actualResult, is(equalTo(result3)));

        actualResult = _30_SubstringWithConcatenationOfAllWords.findSubstring(s4, words4);
        assertThat(actualResult, is(equalTo(result4)));

        actualResult = _30_SubstringWithConcatenationOfAllWords.findSubstring(s5, words5);
        assertThat(actualResult, is(equalTo(result5)));

        actualResult = _30_SubstringWithConcatenationOfAllWords.findSubstring(s6, words6);
        assertThat(actualResult, is(equalTo(result6)));

        actualResult = _30_SubstringWithConcatenationOfAllWords.findSubstring(s7, words7);
        assertThat(actualResult, is(equalTo(result7)));
    }
}