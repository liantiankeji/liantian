package bean
import java.io.Serializable

/**
 * Created by Administrator on 2017/11/30.
 */
class HotData : Serializable {

    var count: Int = 0
    var total: Int = 0
    var nextPageUrl: Any? = null
    var itemList: List<ItemListBean>? = null

    class ItemListBean :Serializable{

        var type: String? = null
        var data: DataBean? = null
        var tag: Any? = null
        var id: Int = 0

        class DataBean :Serializable{

            var dataType: String? = null
            var id: Int = 0
            var title: String? = null
            var slogan: String? = null
            var description: String? = null
            var provider: ProviderBean? = null
            var category: String? = null
            var author: AuthorBean? = null
            var cover: CoverBean? = null
            var playUrl: String? = null
            var thumbPlayUrl: String? = null
            var duration: Int = 0
            var webUrl: WebUrlBean? = null
            var releaseTime: Long = 0
            var library: String? = null
            var consumption: ConsumptionBean? = null
            var campaign: Any? = null
            var waterMarks: Any? = null
            var adTrack: Any? = null
            var type: String? = null
            var titlePgc: String? = null
            var descriptionPgc: String? = null
            var remark: Any? = null
            var idx: Int = 0
            var shareAdTrack: Any? = null
            var favoriteAdTrack: Any? = null
            var webAdTrack: Any? = null
            var date: Long = 0
            var promotion: Any? = null
            var label: Any? = null
            var descriptionEditor: String? = null
            var isCollected: Boolean = false
            var isPlayed: Boolean = false
            var lastViewTime: Any? = null
            var playlists: Any? = null
            var playInfo: List<PlayInfoBean>? = null
            var tags: List<TagsBean>? = null
            var labelList: List<*>? = null
            var subtitles: List<*>? = null

            class ProviderBean : Serializable{


                var name: String? = null
                var alias: String? = null
                var icon: String? = null
            }

            class AuthorBean : Serializable{

                var id: Int = 0
                var icon: String? = null
                var name: String? = null
                var description: String? = null
                var link: String? = null
                var latestReleaseTime: Long = 0
                var videoNum: Int = 0
                var adTrack: Any? = null
                var follow: FollowBean? = null
                var shield: ShieldBean? = null
                var approvedNotReadyVideoCount: Int = 0
                var isIfPgc: Boolean = false

                class FollowBean :Serializable{


                    var itemType: String? = null
                    var itemId: Int = 0
                    var isFollowed: Boolean = false
                }

                class ShieldBean :Serializable{


                    var itemType: String? = null
                    var itemId: Int = 0
                    var isShielded: Boolean = false
                }
            }

            class CoverBean :Serializable{


                var feed: String? = null
                var detail: String? = null
                var blurred: String? = null
                var sharing: Any? = null
                var homepage: String? = null
            }

            class WebUrlBean :Serializable{


                var raw: String? = null
                var forWeibo: String? = null
            }

            class ConsumptionBean : Serializable{


                var collectionCount: Int = 0
                var shareCount: Int = 0
                var replyCount: Int = 0
            }

            class PlayInfoBean :Serializable{


                var height: Int = 0
                var width: Int = 0
                var name: String? = null
                var type: String? = null
                var url: String? = null
                var urlList: List<UrlListBean>? = null

                class UrlListBean :Serializable{
                    /**
                     * name : qcloud
                     * url : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=26150&editionType=normal&source=qcloud
                     * size : 11950979
                     */

                    var name: String? = null
                    var url: String? = null
                    var size: Int = 0
                }
            }

            class TagsBean :Serializable{
                /**
                 * id : 2
                 * name : 创意
                 * actionUrl : eyepetizer://tag/2/?title=%E5%88%9B%E6%84%8F
                 * adTrack : null
                 * desc : 创意十足的style
                 * bgPicture : http://img.kaiyanapp.com/e6eee049dd13fe8ce0712a6f2648d7e2.jpeg?imageMogr2/quality/100
                 * headerImage : http://img.kaiyanapp.com/fdefdb34cbe3d2ac9964d306febe9025.jpeg?imageMogr2/quality/100
                 * tagRecType : NORMAL
                 */

                var id: Int = 0
                var name: String? = null
                var actionUrl: String? = null
                var adTrack: Any? = null
                var desc: String? = null
                var bgPicture: String? = null
                var headerImage: String? = null
                var tagRecType: String? = null
            }
        }
    }
}
