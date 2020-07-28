package com.alibaba.ttl.spi;

import com.alibaba.ttl.TtlUnwrap;
import edu.umd.cs.findbugs.annotations.NonNull;

/**
 * Ttl Wrapper interface. Used to mark wrapper types.
 *
 * @author Jerry Lee (oldratlee at gmail dot com)
 * @see TtlUnwrap#unwrap
 * @see com.alibaba.ttl.TtlCallable
 * @see com.alibaba.ttl.TtlRunnable
 * @see com.alibaba.ttl.threadpool.TtlExecutors
 * @see com.alibaba.ttl.threadpool.DisableInheritableThreadFactory
 * @see com.alibaba.ttl.threadpool.DisableInheritableForkJoinWorkerThreadFactory
 * @since 2.11.4
 */
public interface TtlWrapper<T> extends TtlEnhanced {
    /**
     * unwrap {@link TtlWrapper} to the original/underneath one.
     *
     * @see TtlUnwrap#unwrap(Object)
     */
    @NonNull
    T unwrap();
}
