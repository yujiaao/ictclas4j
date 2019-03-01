package org.ictclas4j.segment;

import java.io.FileInputStream;
import java.io.InputStream;

import org.ictclas4j.bean.SegResult;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SegTagTest
{
    @Test
    public void split() throws Exception {
		String src = "日本早在1923年的关东大地震后就着手制定校舍安全政策，1995年阪神大地震后开始实施“校舍补强计划”，对不具备抗御7级地震的校舍进行加固，2008年中国汶川地震后，日本政府迅速启动了面向45万所公立中小学的“五年补强计划”。";
		SegResult res = new SegTag(1).split(src);
		assertTrue(res.getMrList().size()>0);
    }

    /**
	 * Tokenizing this text causes an endless loop: 月份牌
	 * @see <a href="http://code.google.com/p/ictclas4j/issues/detail?id=13">Issue 13</a>
	 */
	@Test(expected=IllegalStateException.class)
	public void testEndlessLoop() throws Exception
	{
		final InputStream coreDictIn = new FileInputStream("data/coreDict.dct");
		final InputStream bigramDictIn = new FileInputStream("data/BigramDict.dct");
		final InputStream personTaggerDctIn = new FileInputStream("data/nr.dct");
		final InputStream personTaggerCtxIn = new FileInputStream("data/nr.ctx");
		final InputStream transPersonTaggerDctIn = new FileInputStream("data/tr.dct");
		final InputStream transPersonTaggerCtxIn = new FileInputStream("data/tr.ctx");
		final InputStream placeTaggerDctIn = new FileInputStream("data/ns.dct");
		final InputStream placeTaggerCtxIn = new FileInputStream("data/ns.ctx");
		final InputStream lexTaggerCtxIn = new FileInputStream("data/lexical.ctx");
		SegTag seg = new SegTag(1, coreDictIn, bigramDictIn, personTaggerDctIn, personTaggerCtxIn,
				transPersonTaggerDctIn, transPersonTaggerCtxIn, placeTaggerDctIn, placeTaggerCtxIn,
				lexTaggerCtxIn);
		seg.split("月份牌");
	}
}
