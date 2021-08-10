package com.studio.plugin

object Dependencies {
    // 沉浸式状态栏
    const val immersionBar = "com.gyf.immersionbar:immersionbar:3.0.0"

    // 视图绑定
    const val binding = "com.hi-dhl:binding:1.1.3"

    // 数据观察
    const val unPeekLiveData = "com.kunminx.arch:unpeek-livedata:6.1.0-beta1"

    // webView封装
    const val agentWeb = "com.github.Justson.AgentWeb:agentweb-core:v4.1.9-androidx"

    // 内存泄露检测
    const val leakcanary = "com.squareup.leakcanary:leakcanary-android:2.7"

    // 适配器
    const val BRVAH = "com.github.CymChad:BaseRecyclerViewAdapterHelper:3.0.6"

    // 刷新
    const val smartRefresh = "com.scwang.smart:refresh-layout-kernel:2.0.3"

    // 数据库
    const val litePal = "org.litepal.guolindev:core:3.2.3"

    // 异步库
    const val rxjava = "io.reactivex.rxjava2:rxjava:2.2.20"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:2.1.1"

    // 权限框架
    const val xxPermission = "com.github.getActivity:XXPermissions:11.2"

    const val lottie = "com.airbnb.android:lottie:3.7.0"

    // MMKV
    const val MMKV = "com.tencent:mmkv:1.2.10"

    // banner
    const val bannerViewPager = "com.github.zhpanvip:BannerViewPager:3.4.0"

    // LiveEventBus
    const val liveEventBus = "io.github.jeremyliao:live-event-bus-x:1.8.0"

    // 下载框架
    const val downloader = "com.github.Justson:Downloader:v4.2.0-androidx"

    const val smoothNavigation = "com.kunminx.archi:smooth-navigation:3.3.2-beta5"
}

// 网路请求
object Retrofit{
    private const val retrofitVersion = "2.9.0"
    const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
    const val retrofitConverter = "com.squareup.retrofit2:converter-gson:$retrofitVersion"
}

// dslTabLayout
object DslTabLayout{
    private const val dslTabVersion = "2.2.0"
    const val dslTabLayout = "com.github.angcyo.DslTablayout:TabLayout:$dslTabVersion"
    const val dslViewPagerDelegate = "com.github.angcyo.DslTablayout:ViewPager1Delegate:$dslTabVersion"
    const val dslViewPager2Delegate = "com.github.angcyo.DslTablayout:ViewPager2Delegate:$dslTabVersion"
}

object ExoPlayer {
    private const val exoPlayerVersion = "2.14.0"
    const val exoPlayerCore = "com.google.android.exoplayer:exoplayer-core:$exoPlayerVersion"
    const val exoPlayerUi = "com.google.android.exoplayer:exoplayer-ui:$exoPlayerVersion"
}

object Glide { // 图片加载
    private const val glideVersion = "4.12.0"
    const val glide = "com.github.bumptech.glide:glide:$glideVersion"
    const val glideAnnotation = "com.github.bumptech.glide:compiler:$glideVersion"
    const val glideOkHttp = "com.github.bumptech.glide:okhttp3-integration:$glideVersion"
}

object UMeng {
    const val common = "com.umeng.umsdk:common:9.3.8"
    const val asms = "com.umeng.umsdk:asms:1.2.2"
}

object Ad {
    const val adMob = "com.google.android.gms:play-services-ads:20.2.0"
    const val facebook = "com.facebook.android:audience-network-sdk:6.5.1"
    const val ironSource = "com.ironsource.sdk:mediationsdk:7.1.0"
    const val unity = "libs/unity-ads.aar"
}

object Mtg {
    private const val mtgVersion = "15.4.22"
    const val videoJs = "com.mintegral.msdk.china:videojs:$mtgVersion"
    const val jsCommon = "com.mintegral.msdk.china:mtgjscommon:$mtgVersion"
    const val playerCommon = "com.mintegral.msdk.china:playercommon:$mtgVersion"
    const val reward = "com.mintegral.msdk.china:reward:$mtgVersion"
    const val videoCommon = "com.mintegral.msdk.china:videocommon:$mtgVersion"
    const val chinaCommon = "com.mintegral.msdk.china:chinacommon:$mtgVersion"
    const val native = "com.mintegral.msdk.china:mtgnative:$mtgVersion"
    const val nativeex = "com.mintegral.msdk.china:nativeex:$mtgVersion"
    const val banner = "com.mintegral.msdk.china:mtgbanner:$mtgVersion"
    const val interstitial = "com.mintegral.msdk.china:interstitial:$mtgVersion"
    const val download = "com.mintegral.msdk.china:mtgdownloads:$mtgVersion"
}

object Google {
    const val ads_identifier = "com.google.android.gms:play-services-ads-identifier:20.2.0"
    const val services_location = "com.google.android.gms:play-services-location:20.2.0"

    // google支付
    const val googleBilling = "com.android.billingclient:billing:3.0.3"
}

object FileOperator {
    private const val fileOperatorVersion = "1.6.2"
    const val fileCore = "com.github.javakam:file.core:$fileOperatorVersion"
    const val fileCoreCompat = "com.github.javakam:file.android-q:$fileOperatorVersion"
}

