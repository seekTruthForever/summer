/*
 * Copyright 2017-2025 msun.com All right reserved. This software is the confidential and proprietary information of
 * msun.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with msun.com.
 */
package com.ms.commons.fasttext.extract;

/**
 * @author zxc Apr 12, 2013 3:38:15 PM
 */
public class LowerCaseExtractText implements ExtractText {

    public String getText(String src) {
        if (src == null) {
            return src;
        }
        String dest = null;
        if (src != null) {
            dest = src.toLowerCase();
        }
        return dest;
    }
}
