package github.hua0512.ncm.data.playlist

import github.hua0512.ncm.data.account.NeteaseBaseProfile
import github.hua0512.ncm.data.account.NeteaseProfile
import github.hua0512.ncm.data.track.NeteaseTrack
import github.hua0512.ncm.data.track.NeteaseTrackIdInfo
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class NeteasePlaylist(
//    val adType: Int,
  val anonimous: Boolean? = null,
//    val artists: Any,
  val backgroundCoverId: Int? = null,
  val backgroundCoverUrl: String? = null,
  val cloudTrackCount: Int,
  val commentThreadId: String,
  val copied: Boolean = false,
  val coverImgId: Long,
  @SerialName("coverImgId_str")
  val coverImgIdStr: String,
  @SerialName("coverImgUrl")
  val coverImgUrl: String,
  val createTime: Long,
  @SerialName("creator")
  val creator: NeteaseProfile,
  val description: String? = null,
  val englishTitle: String? = null,
  val highQuality: Boolean = false,
  @SerialName("id")
  val id: Long,
  @SerialName("name")
  val name: String,
  val newImported: Boolean,
  val opRecommend: Boolean = false,
  val ordered: Boolean,
  val playCount: Int,
  val privacy: Int = 0,
  val recommendText: String? = null,
  val shareCount: Int = 0,
  val commentCount: Int = 0,
  val recommendInfo: String? = null,
  val shareStatus: String? = null,
  val sharedUsers: List<String>? = emptyList(),
  val specialType: Int,
  val status: Int,
  val subscribed: Boolean,
  val subscribedCount: Int,
  val subscribers: List<NeteaseProfile>? = emptyList(),
  val tags: List<String>? = emptyList(),
  val titleImage: Int? = null,
  val titleImageUrl: String? = null,
  val top: Boolean? = null,
  val totalDuration: Int? = null,
  val trackCount: Int,
  val trackNumberUpdateTime: Long,
  val trackUpdateTime: Long,
  val tracks: List<NeteaseTrack>? = emptyList(),
  val trackIds: List<NeteaseTrackIdInfo>? = emptyList(),
  val updateFrequency: String? = null,
  val updateTime: Long,
  val coverStatus: Int? = null,
  val socialPlaylistCover: String? = null,
  val copywriter: String? = null,
  val tag: String? = null,
  val officialPlaylistType: Int? = null,
  val relatedResType: Int? = null,
  val videoIds: List<String>? = emptyList(),
  val videos: List<String>? = emptyList(),
) : NeteaseBaseProfile()
