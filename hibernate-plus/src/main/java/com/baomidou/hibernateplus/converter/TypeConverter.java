/**
 * The MIT License (MIT)
 * <p>
 * Copyright (c) 2016 Caratacus
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.baomidou.hibernateplus.converter;

/**
 * 数据类型转换接口
 * <p/>
 * User: liyd
 * Date: 13-5-9 下午12:04
 * version $Id: TypeConverter.java, v 0.1 Exp $
 */
public interface TypeConverter {

    /**
     * 获取源类型class
     *
     * @return 源类型class
     */
    Class<?> getSourceTypeClass();

    /**
     * 获取目标类型class
     *
     * @return 目标类型class
     */
    Class<?> getTargetTypeClass();

    /**
     * 转换操作
     * 会有接口和实现类的关系，所以必须传入实际操作的类，不然枚举等类型会得不到具体的枚举值
     *
     * @param actualSourceClass the actual source class
     * @param actualTargetClass the actual target class
     * @param value The input value to be converted
     * @return The converted value
     */
    Object convert(Class<?> actualSourceClass, Class<?> actualTargetClass, Object value);

}
