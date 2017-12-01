package com.bwie.kotlin.find.Bean

/**
 * Created by 王帅彪 on 2017/12/1.
 */
class Bean2 {
data class Shows(
		val count: Int, //10
		val itemList: List<Item>,
		val nextPageUrl: String, //http://baobab.kaiyanapp.com/api/v3/videos?start=10&num=10&categoryName=%E6%97%B6%E5%B0%9A&strategy=date
		val total: Int //0
)

data class Item(
		val data: Data,
		val id: Int, //0
		val type: String //video
)

data class Data(
		val author: Author,
		val category: String, //时尚
		val collected: Boolean, //false
		val consumption: Consumption,
		val cover: Cover,
		val dataType: String, //VideoBeanForClient
		val date: Long, //1511488804000
		val description: String, //你们以为X是那么好装的吗！
		val descriptionEditor: String,
		val descriptionPgc: String, //你们以为X是那么好装的吗！
		val duration: Int, //59
		val id: Int, //62008
		val idx: Int, //0
		val labelList: List<Any>,
		val library: String, //DEFAULT
		val playInfo: List<PlayInfo>,
		val playUrl: String, //http://baobab.kaiyanapp.com/api/v1/playUrl?vid=62008&editionType=default&source=qcloud
		val played: Boolean, //false
		val provider: Provider,
		val releaseTime: Long, //1511488804000
		val remark: String, //《差点一分钟》是机核一档全新的短视频节目。顾名思义，就是力求在任何视频发布平台都不需要观看广告的1分钟之内，抓紧时间跟你说一个很小的事儿，小名——“说个小事儿”。暂定为每周四和周六，以及隔周的周一播出。目前这还是一档无方向、无定位、无主题的三无栏目，因此你会在这个栏目里看到各种领域的各种内容，唯一不变的就只有每期时长，都刚好是59秒。我们非常真诚的期待大家的宝贵意见和建议~
		val subtitles: List<Any>,
		val tags: List<Tag>,
		val title: String, //一套王牌特工套装到底需要多少钱？
		val titlePgc: String, //一套王牌特工套装到底需要多少钱？
		val type: String, //NORMAL
		val webUrl: WebUrl
)

data class Author(
		val approvedNotReadyVideoCount: Int, //0
		val description: String, //挖掘游戏、二次元、影视背后的文化内容
		//http://www.g-cores.com/
		val follow: Follow,
		val icon: String, //http://img.kaiyanapp.com/95fd5b7dbdf449ac1723f0cb71df6823.jpeg?imageMogr2/quality/60
		val id: Int, //300
		val ifPgc: Boolean, //true
		val latestReleaseTime: Long, //1511488804000
		val link: String,
		val name: String, //机核
		val shield: Shield,
		val videoNum: Int //22
)

data class Shield(
		val itemId: Int, //300
		val itemType: String, //author
		val shielded: Boolean //false
)

data class Follow(
		val followed: Boolean, //false
		val itemId: Int, //300
		val itemType: String //author
)

data class Cover(
		val blurred: String, //http://img.kaiyanapp.com/9321bc705e34a281742e96bbd1038fae.jpeg?imageMogr2/quality/60/format/jpg
		val detail: String, //http://img.kaiyanapp.com/abfc776835c218c7702eac8f237b56f5.png?imageMogr2/quality/60/format/jpg
		val feed: String //http://img.kaiyanapp.com/abfc776835c218c7702eac8f237b56f5.png?imageMogr2/quality/60/format/jpg
)

data class WebUrl(
		val forWeibo: String, //http://www.eyepetizer.net/detail.html?vid=62008
		val raw: String //http://www.eyepetizer.net/detail.html?vid=62008
)

data class Consumption(
		val collectionCount: Int, //2
		val replyCount: Int, //1
		val shareCount: Int //9
)

data class Provider(
		val alias: String, //PGC
		val icon: String,
		val name: String //PGC
)

data class PlayInfo(
		val height: Int, //480
		val name: String, //标清
		val type: String, //normal
		val url: String, //http://baobab.kaiyanapp.com/api/v1/playUrl?vid=62008&editionType=normal&source=qcloud
		val urlList: List<Url>,
		val width: Int //854
)

data class Url(
		val name: String, //qcloud
		val size: Int, //5248946
		val url: String //http://baobab.kaiyanapp.com/api/v1/playUrl?vid=62008&editionType=normal&source=qcloud
)

data class Tag(
		val actionUrl: String, //eyepetizer://tag/719/?title=%E6%96%B0%E7%89%87%E9%80%9F%E9%80%92
		val bgPicture: String, //http://img.kaiyanapp.com/ffec9c5b73df21d31d3b210d3fd776b1.jpeg?imageMogr2/quality/60/format/jpg
		val desc: String, //最新的电影预告，音乐 MV 以及更多的相关内容
		val headerImage: String, //http://img.kaiyanapp.com/ffec9c5b73df21d31d3b210d3fd776b1.jpeg?imageMogr2/quality/60/format/jpg
		val id: Int, //719
		val name: String, //新片速递
		val tagRecType: String //IMPORTANT
)
}