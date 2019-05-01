package json.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RedditJsonModel {
	
	public String kind;
	public String getKind() {return kind;}
	public void setKind(String value) {this.kind = value;}
		    
	public Data data;
	public Data getData() {return data;}
	public void setData(Data value) {this.data = value;}
	
	public static class MediaEmbed
	{
	    public String content;
	    public String getContent(){return content;}
		public void setContent(String content){this.content = content;}
		
	    public int width;
	    public int getWidth() {return width;}
	    public void setWidth(int width) {this.width = width;}
	    
	    public boolean scrolling;
	    public boolean getScrolling() {return scrolling;}
	    public void setScrolling(boolean scrolling) {this.scrolling = scrolling;}
	    
	    public int height;
	    public int getHeight() {return height;}
	    public void setHeight(int height) {this.height = height;}			
	}

	public static class Oembed
	{
	    public String provider_url;
	    public String getProvider_url() {return provider_url;}
	    public void setProvider_url(String provider_url) {this.provider_url = provider_url;}
	    
	    public String description;
	    public String getDescription() {return description;}
	    public void setDescription(String description) {this.description = description;}
	    
	    public String title;
	    public String getTitle() {return title;}
	    public void setTitle(String title) {this.title = title;}
	    
	    public String type;
	    public String getType() {return type;}
	    public void setType(String type) {this.type = type;}
	     
	    public int thumbnail_width;
	    public int getThumbnail_width() {return thumbnail_width;}
	    public void setThumbnail_width(int thumbnail_width) {this.thumbnail_width = thumbnail_width;}
	        
	    public int height;
	    public int getHeight() {return height;}
	    public void setHeight(int height) {this.height = height;}
	    
	    public int width;
	    public int getWidth() {return width;}
	    public void setWidth(int width) {this.width = width;}
	    
	    public String html;
	    public String getHtml() {return html;}
	    public void SetHtml(String html) {this.html = html;}
	    
	    public String version;
	    public String getVersion() {return version;}
	    public void setVersion(String version) {this.version = version;}
	    
	    public String provider_name;
	    public String getProvider_name() {return provider_name;}
	    public void setProvider_name(String provider_name) {this.provider_name = provider_name;}
	    
	    public String thumbnail_url;
	    public String getThumbnail_url() {return thumbnail_url;}
	    public void setThumbnail_url(String thumbnail_url) {this.thumbnail_url = thumbnail_url;}
	    
	    public int thumbnail_height;
	    public int getThumbnail_height() {return thumbnail_height;}
	    public void setThumbnail_height(int thumbnail_height) {this.thumbnail_height = thumbnail_height;}
	    
	    public String author_name;
	    public String getAuthor_name() {return author_name;}
	    public void setAuthor_name(String author_name) {this.author_name = author_name;}
	    
	    public String author_url;
	    public String getAuthor_url() {return author_url;}
	    public void setAuthor_url(String author_url) {this.author_url = author_url;}
	}

	public static class RedditVideo
	{
	    public String fallback_url;
	    public String getFallback_url() {return fallback_url;}
	    public void setFallback_url(String fallback_url) {this.fallback_url = fallback_url;}
	    
	    public int height;
	    public int getHeight() {return height;}
	    public void setHeight(int height) {this.height = height;}
	    
	    public int width;
	    public int getWidth() {return width;}
	    public void setWidth(int width) {this.width = width;}
	    
	    public String scrubber_media_url;
	    public String getScrubber_media_url() {return scrubber_media_url;}
		public void setScrubber_media_url(String scrubber_media_url){this.scrubber_media_url = scrubber_media_url;}
	    
	    public String dash_url;
	    public String getDash_url(){return dash_url;}
		public void setDash_url(String dash_url){this.dash_url = dash_url;}
	    
	    public int duration;
	    public int getDuration(){return duration;}
		public void setDuration(int duration){this.duration = duration;}
	    
	    public String hls_url;
	    public String getHls_url(){return hls_url;}
		public void setHls_url(String hls_url){this.hls_url = hls_url;}
	    
	    public boolean is_gif;
	    public boolean getIs_gif(){return is_gif;}
		public void setIs_gif(boolean is_gif){this.is_gif = is_gif;}
	    
	    public String transcoding_status;
		public String getTranscoding_status(){return transcoding_status;}
		public void setTranscoding_status(String transcoding_status){this.transcoding_status = transcoding_status;}
	}

	public static class SecureMedia
	{
	    public Oembed oembed;
	    public Oembed getOembed() {return oembed;}
		public void setOembed(Oembed value) {this.oembed = value;}
		
		public String type;
		public String getType() {return type;}
		public void setType(String type) {this.type = type;}
		
		public RedditVideo reddit_video;
		public RedditVideo getReddit_video() {return reddit_video;}
		public void setReddit_video(RedditVideo reddit_video) {this.reddit_video = reddit_video;}
	}

	public static class SecureMediaEmbed
	{
	    public String content;
	    public String getContent() {return content;}
		public void setContent(String content) {this.content = content;}
		
		public int width;
		public int getWidth() {return width;}
		public void setWidth(int width) {this.width = width;}
		
		public boolean scrolling;
		public boolean isScrolling() {return scrolling;}
		public void setScrolling(boolean scrolling) {this.scrolling = scrolling;}
		
		public String media_domain_url;
		public String getMedia_domain_url() {return media_domain_url;}
		public void setMedia_domain_url(String media_domain_url) {this.media_domain_url = media_domain_url;}
		
		public int height;
		public int getHeight() {return height;}
		public void setHeight(int height) {this.height = height;}  
	}

	public static class Gildings
	{
	    public int gid_1;
	    public int getGid_1() {return gid_1;}
		public void setGid_1(int gid_1) {this.gid_1 = gid_1;}
		
		public int gid_2;
		public int getGid_2() {return gid_2;}
		public void setGid_2(int gid_2) {this.gid_2 = gid_2;}
		
		public int gid_3;
		public int getGid_3() {return gid_3;}
		public void setGid_3(int gid_3) {this.gid_3 = gid_3;}
	}

	public static class Oembed2
	{
	    public String provider_url;
	    public String getProvider_url() {return provider_url;}
		public void setProvider_url(String provider_url) {this.provider_url = provider_url;}
		
		public String description;
		public String getDescription() {return description;}
		public void setDescription(String description) {this.description = description;}
		
		public String title;
		public String getTitle() {return title;}
		public void setTitle(String title) {this.title = title;}
		
		public String type;
		public String getType() {return type;}
		public void setType(String type) {this.type = type;}
		
		public int thumbnail_width;
		public int getThumbnail_width() {return thumbnail_width;}
		public void setThumbnail_width(int thumbnail_width) {this.thumbnail_width = thumbnail_width;}
		
		public int height;
		public int getHeight() {return height;}
		public void setHeight(int height) {this.height = height;}
		
		public int width;
		public int getWidth() {return width;}
		public void setWidth(int width) {this.width = width;}
		
		public String html;
		public String getHtml() {return html;}
		public void setHtml(String html) {this.html = html;}
		
		public String version;
		public String getVersion() {return version;}
		public void setVersion(String version) {this.version = version;}
		
		public String provider_name;
		public String getProvider_name() {return provider_name;}
		public void setProvider_name(String provider_name) {this.provider_name = provider_name;}
		
		public String thumbnail_url;
		public String getThumbnail_url() {return thumbnail_url;}
		public void setThumbnail_url(String thumbnail_url) {this.thumbnail_url = thumbnail_url;}
		
		public int thumbnail_height;
		public int getThumbnail_height() {return thumbnail_height;}
		public void setThumbnail_height(int thumbnail_height) {this.thumbnail_height = thumbnail_height;}
		
		public String author_name;
		public String getAuthor_name() {return author_name;}
		public void setAuthor_name(String author_name) {this.author_name = author_name;}
		
		public String author_url;
		public String getAuthor_url() {return author_url;}
		public void setAuthor_url(String author_url) {this.author_url = author_url;}  
	}

	public static class RedditVideo2
	{
	    public String fallback_url;
	    public String getFallback_url() {return fallback_url;}
		public void setFallback_url(String fallback_url) {this.fallback_url = fallback_url;}
		
		public int height;
		public int getHeight() {return height;}
		public void setHeight(int height) {this.height = height;}
		
		public int width;
		public int getWidth() {return width;}
		public void setWidth(int width) {this.width = width;}
		
		public String scrubber_media_url;
		public String getScrubber_media_url() {return scrubber_media_url;}
		public void setScrubber_media_url(String scrubber_media_url) {this.scrubber_media_url = scrubber_media_url;}
		
		public String dash_url;
		public String getDash_url() {return dash_url;}
		public void setDash_url(String dash_url) {this.dash_url = dash_url;}
		
		public int duration;
		public int getDuration() {return duration;}
		public void setDuration(int duration) {this.duration = duration;}
		
		public String hls_url;
		public String getHls_url() {return hls_url;}
		public void setHls_url(String hls_url) {this.hls_url = hls_url;}
		
		public boolean is_gif;
		public boolean isIs_gif() {return is_gif;}
		public void setIs_gif(boolean is_gif) {this.is_gif = is_gif;}
		
		public String transcoding_status;
		public String getTranscoding_status() {return transcoding_status;}
		public void setTranscoding_status(String transcoding_status) {this.transcoding_status = transcoding_status;} 
	}

	public static class Media
	{
	    public Oembed2 oembed;
	    public Oembed2 getOembed() {return oembed;}
		public void setOembed(Oembed2 oembed) {this.oembed = oembed;}
		
		public String type;
		public String getType() {return type;}
		public void setType(String type) {this.type = type;}
		
		public RedditVideo2 reddit_video;
		public RedditVideo2 getReddit_video() {return reddit_video;}
		public void setReddit_video(RedditVideo2 reddit_video) {this.reddit_video = reddit_video;}	    
	}

	public static class Source
	{
	    public String url;
	    public String getUrl() {return url;}
		public void setUrl(String url) {this.url = url;}
		
		public int width;
		public int getWidth() {return width;}
		public void setWidth(int width) {this.width = width;}
		
		public int height;
		public int getHeight() {return height;}
		public void setHeight(int height) {this.height = height;}
	}

	public static class Resolution
	{
	    public String url;
	    public String getUrl() {return url;}
		public void setUrl(String url) {this.url = url;}
		
		public int width;
		public int getWidth() {return width;}
		public void setWidth(int width) {this.width = width;}
		
		public int height;
		public int getHeight() {return height;}
		public void setHeight(int height) {this.height = height;}  
	}

	public static class Source2
	{
	    public String url;
	    public String getUrl() {return url;}
		public void setUrl(String url) {this.url = url;}
		
		public int width;
		public int getWidth() {return width;}
		public void setWidth(int width) {this.width = width;}
		
		public int height;
		public int getHeight() {return height;}
		public void setHeight(int height) {this.height = height;}   
	}

	public static class Resolution2
	{
	    public String url;
	    public String getUrl() {return url;}
		public void setUrl(String url) {this.url = url;}
		
		public int width;
		public int getWidth() {return width;}
		public void setWidth(int width) {this.width = width;}
		
		public int height;
		public int getHeight() {return height;}
		public void setHeight(int height) {this.height = height;}
	}

	@JsonIgnoreProperties
	public static class Gif
	{
	    public Source2 source;
	    public Source2 getSource() {return source;}
		public void setSource(Source2 source) {this.source = source;}
		
		public List<Resolution2> resolutions;
		public List<Resolution2> getResolutions() {return resolutions;}
		public void setResolutions(List<Resolution2> resolutions) {this.resolutions = resolutions;}
	}

	public static class Source3
	{
	    public String url;
	    public String getUrl() {return url;}
		public void setUrl(String url) {this.url = url;}
		
		public int width;
		public int getWidth() {return width;}
		public void setWidth(int width) {this.width = width;}
		
		public int height;
		public int getHeight() {return height;}
		public void setHeight(int height) {this.height = height;}
	}

	public static class Resolution3
	{
	    public String url;
	    public String getUrl() {return url;}
		public void setUrl(String url) {this.url = url;}
		
		public int width;
		public int getWidth() {return width;}
		public void setWidth(int width) {this.width = width;}
		
		public int height;
		public int getHeight() {return height;}
		public void setHeight(int height) {this.height = height;}   
	}

	@JsonIgnoreProperties
	public static class Mp4
	{
	    public Source3 source;
	    public Source3 getSource() {return source;}
		public void setSource(Source3 source) {this.source = source;}
		
		public List<Resolution3> resolutions;
		public List<Resolution3> getResolutions() {return resolutions;}
		public void setResolutions(List<Resolution3> resolutions) {this.resolutions = resolutions;}	
	}

	public static class Variants
	{
		public Gif gif;
	    public Gif getGif() {return gif;}
		public void setGif(Gif gif) {this.gif = gif;}
		
		public Mp4 mp4;
		public Mp4 getMp4() {return mp4;}
		public void setMp4(Mp4 mp4) {this.mp4 = mp4;}  
	}

	public static class Image
	{
	    public Source source;
	    public Source getSource() {return source;}
		public void setSource(Source source) {this.source = source;}
		
		public List<Resolution> resolutions;
		public List<Resolution> getResolutions() {return resolutions;}
		public void setResolutions(List<Resolution> resolutions) {this.resolutions = resolutions;}
		
		public Variants variants;
		public Variants getVariants() {return variants;}
		public void setVariants(Variants variants) {this.variants = variants;}
		
		public String id;
		public String getId() {return id;}
		public void setId(String id) {this.id = id;} 
	}

	public static class RedditVideoPreview
	{
		public String fallback_url;
	    public String getFallback_url() {return fallback_url;}
		public void setFallback_url(String fallback_url) {this.fallback_url = fallback_url;}
		
		public int height;
		public int getHeight() {return height;}
		public void setHeight(int height) {this.height = height;}
		
		public int width;
		public int getWidth() {return width;}
		public void setWidth(int width) {this.width = width;}
		
		public String scrubber_media_url;
		public String getScrubber_media_url() {return scrubber_media_url;}
		public void setScrubber_media_url(String scrubber_media_url) {this.scrubber_media_url = scrubber_media_url;}
		
		public String dash_url;
		public String getDash_url() {return dash_url;}
		public void setDash_url(String dash_url) {this.dash_url = dash_url;}
		
		public int duration;
		public int getDuration() {return duration;}
		public void setDuration(int duration) {this.duration = duration;}
		
		public String hls_url;
		public String getHls_url() {return hls_url;}
		public void setHls_url(String hls_url) {this.hls_url = hls_url;}
		
		public boolean is_gif;
		public boolean isIs_gif() {return is_gif;}
		public void setIs_gif(boolean is_gif) {this.is_gif = is_gif;}
		
		public String transcoding_status;
		public String getTranscoding_status() {return transcoding_status;}
		public void setTranscoding_status(String transcoding_status) {this.transcoding_status = transcoding_status;}
    
	}

	public static class Preview
	{
	    public List<Image> images;
	    public List<Image> getImages() {return images;}
		public void setImages(List<Image> images) {this.images = images;}
		
		public boolean enabled;
		public boolean isEnabled() {return enabled;}
		public void setEnabled(boolean enabled) {this.enabled = enabled;}
		
		public RedditVideoPreview reddit_video_preview;
		public RedditVideoPreview getReddit_video_preview() {return reddit_video_preview;}
		public void setReddit_video_preview(RedditVideoPreview reddit_video_preview) {this.reddit_video_preview = reddit_video_preview;}    
	}

	public static class Data2
	{
	    public Object approved_at_utc;
	    public Object getApproved_at_utc() {return approved_at_utc;}
		public void setApproved_at_utc(Object approved_at_utc) {this.approved_at_utc = approved_at_utc;}
		
		public String subreddit;
		public String getSubreddit() {return subreddit;}
		public void setSubreddit(String subreddit) {this.subreddit = subreddit;}
		
		public String selftext;
		public String getSelftext() {return selftext;}
		public void setSelftext(String selftext) {this.selftext = selftext;}
		
		public String author_fullname;
		public String getAuthor_fullname() {return author_fullname;}
		public void setAuthor_fullname(String author_fullname) {this.author_fullname = author_fullname;}
		
		public boolean saved;
		public boolean isSaved() {return saved;}
		public void setSaved(boolean saved) {this.saved = saved;}
		
		public Object mod_reason_title;
		public Object getMod_reason_title() {return mod_reason_title;}
		public void setMod_reason_title(Object mod_reason_title) {this.mod_reason_title = mod_reason_title;}
		
		public int gilded;
		public int getGilded() {return gilded;}
		public void setGilded(int gilded) {this.gilded = gilded;}
		
		public boolean clicked;
		public boolean isClicked() {return clicked;}
		public void setClicked(boolean clicked) {this.clicked = clicked;}
		
		public String title;
		public String getTitle() {return title;}
		public void setTitle(String title) {this.title = title;}
		
		public List<Object> link_flair_richtext;
		public List<Object> getLink_flair_richtext() {return link_flair_richtext;}
		public void setLink_flair_richtext(List<Object> link_flair_richtext) {this.link_flair_richtext = link_flair_richtext;}
		
		public String subreddit_name_prefixed;
		public String getSubreddit_name_prefixed() {return subreddit_name_prefixed;}
		public void setSubreddit_name_prefixed(String subreddit_name_prefixed) {this.subreddit_name_prefixed = subreddit_name_prefixed;}
		
		public boolean hidden;
		public boolean isHidden() {return hidden;}
		public void setHidden(boolean hidden) {this.hidden = hidden;}
		
		public int pwls;
		public int getPwls() {return pwls;}
		public void setPwls(int pwls) {this.pwls = pwls;}
		
		public String link_flair_css_class;
		public String getLink_flair_css_class() {return link_flair_css_class;}
		public void setLink_flair_css_class(String link_flair_css_class) {this.link_flair_css_class = link_flair_css_class;}
		
		public int downs;
		public int getDowns() {return downs;}
		public void setDowns(int downs) {this.downs = downs;}
		
		public int thumbnail_height;
		public int getThumbnail_height() {return thumbnail_height;}
		public void setThumbnail_height(int thumbnail_height) {this.thumbnail_height = thumbnail_height;}
		
		public boolean hide_score;
		public boolean isHide_score() {return hide_score;}
		public void setHide_score(boolean hide_score) {this.hide_score = hide_score;}
		
		public String name;
		public String getName() {return name;}
		public void setName(String name) {this.name = name;}
		
		public boolean quarantine;
		public boolean isQuarantine() {return quarantine;}
		public void setQuarantine(boolean quarantine) {this.quarantine = quarantine;}
		
		public String link_flair_text_color;
		public String getLink_flair_text_color() {return link_flair_text_color;}
		public void setLink_flair_text_color(String link_flair_text_color) {this.link_flair_text_color = link_flair_text_color;}
		
		public String author_flair_background_color;
		public String getAuthor_flair_background_color() {return author_flair_background_color;}
		public void setAuthor_flair_background_color(String author_flair_background_color) {this.author_flair_background_color = author_flair_background_color;}
		
		public String subreddit_type;
		public String getSubreddit_type() {return subreddit_type;}
		public void setSubreddit_type(String subreddit_type) {this.subreddit_type = subreddit_type;}
		
		public int ups;
		public int getUps() {return ups;}
		public void setUps(int ups) {this.ups = ups;}
		
		public int total_awards_received;
		public int getTotal_awards_received() {return total_awards_received;}
		public void setTotal_awards_received(int total_awards_received) {this.total_awards_received = total_awards_received;}
		
		public MediaEmbed media_embed;
		public MediaEmbed getMedia_embed() {return media_embed;}
		public void setMedia_embed(MediaEmbed media_embed) {this.media_embed = media_embed;}
		
		public int thumbnail_width;
		public int getThumbnail_width() {return thumbnail_width;}
		public void setThumbnail_width(int thumbnail_width) {this.thumbnail_width = thumbnail_width;}
		
		public String author_flair_template_id;
		public String getAuthor_flair_template_id() {return author_flair_template_id;}
		public void setAuthor_flair_template_id(String author_flair_template_id) {this.author_flair_template_id = author_flair_template_id;}
		
		public boolean is_original_content;
		public boolean isIs_original_content() {return is_original_content;}
		public void setIs_original_content(boolean is_original_content) {this.is_original_content = is_original_content;}
		
		public List<Object> user_reports;
		public List<Object> getUser_reports() {return user_reports;}
		public void setUser_reports(List<Object> user_reports) {this.user_reports = user_reports;}
		
		public SecureMedia secure_media;
		public SecureMedia getSecure_media() {return secure_media;}
		public void setSecure_media(SecureMedia secure_media) {this.secure_media = secure_media;}
		
		public boolean is_reddit_media_domain;
		public boolean isIs_reddit_media_domain() {return is_reddit_media_domain;}
		public void setIs_reddit_media_domain(boolean is_reddit_media_domain) {this.is_reddit_media_domain = is_reddit_media_domain;}
		
		public boolean is_meta;
		public boolean isIs_meta() {return is_meta;}
		public void setIs_meta(boolean is_meta) {this.is_meta = is_meta;}
		
		public Object category;
		public Object getCategory() {return category;}
		public void setCategory(Object category) {this.category = category;}
		
		public SecureMediaEmbed secure_media_embed;
		public SecureMediaEmbed getSecure_media_embed() {return secure_media_embed;}
		public void setSecure_media_embed(SecureMediaEmbed secure_media_embed) {this.secure_media_embed = secure_media_embed;}
		
		public String link_flair_text;
		public String getLink_flair_text() {return link_flair_text;}
		public void setLink_flair_text(String link_flair_text) {this.link_flair_text = link_flair_text;}
		
		public boolean can_mod_post;
		public boolean isCan_mod_post() {return can_mod_post;}
		public void setCan_mod_post(boolean can_mod_post) {this.can_mod_post = can_mod_post;}
		
		public int score;
		public int getScore() {return score;}
		public void setScore(int score) {this.score = score;}
		
		public Object approved_by;
		public Object getApproved_by() {return approved_by;}
		public void setApproved_by(Object approved_by) {this.approved_by = approved_by;}
		
		public String thumbnail;
		public String getThumbnail() {return thumbnail;}
		public void setThumbnail(String thumbnail) {this.thumbnail = thumbnail;}
		
		public Object edited;
		public Object getEdited() {return edited;}
		public void setEdited(Object edited) {this.edited = edited;}
		
		public String author_flair_css_class;
		public String getAuthor_flair_css_class() {return author_flair_css_class;}
		public void setAuthor_flair_css_class(String author_flair_css_class) {this.author_flair_css_class = author_flair_css_class;}
		
		public List<Object> author_flair_richtext;
		public List<Object> getAuthor_flair_richtext() {return author_flair_richtext;}
		public void setAuthor_flair_richtext(List<Object> author_flair_richtext) {this.author_flair_richtext = author_flair_richtext;}
		
		public Gildings gildings;
		public Gildings getGildings() {return gildings;}
		public void setGildings(Gildings gildings) {this.gildings = gildings;}
		
		public Object content_categories;
		public Object getContent_categories() {return content_categories;}
		public void setContent_categories(Object content_categories) {this.content_categories = content_categories;}
		
		public boolean is_self;
		public boolean isIs_self() {return is_self;}
		public void setIs_self(boolean is_self) {this.is_self = is_self;}
		
		public Object mod_note;
		public Object getMod_note() {return mod_note;}
		public void setMod_note(Object mod_note) {this.mod_note = mod_note;}
		
		public double created;
		public double getCreated() {return created;}
		public void setCreated(double created) {this.created = created;}
		
		public String link_flair_type;
		public String getLink_flair_type() {return link_flair_type;}
		public void setLink_flair_type(String link_flair_type) {this.link_flair_type = link_flair_type;}
		
		public int wls;
		public int getWls() {return wls;}
		public void setWls(int wls) {this.wls = wls;}
		
		public Object banned_by;
		public Object getBanned_by() {return banned_by;}
		public void setBanned_by(Object banned_by) {this.banned_by = banned_by;}
		
		public String author_flair_type;
		public String getAuthor_flair_type() {return author_flair_type;}
		public void setAuthor_flair_type(String author_flair_type) {this.author_flair_type = author_flair_type;}
		
		public String domain;
		public String getDomain() {return domain;}
		public void setDomain(String domain) {this.domain = domain;}
		
		public String selftext_html;
		public String getSelftext_html() {return selftext_html;}
		public void setSelftext_html(String selftext_html) {this.selftext_html = selftext_html;}
		
		public Object likes;
		public Object getLikes() {return likes;}
		public void setLikes(Object likes) {this.likes = likes;}
		
		public String suggested_sort;
		public String getSuggested_sort() {return suggested_sort;}
		public void setSuggested_sort(String suggested_sort) {this.suggested_sort = suggested_sort;}
		
		public Object banned_at_utc;
		public Object getBanned_at_utc() {return banned_at_utc;}
		public void setBanned_at_utc(Object banned_at_utc) {this.banned_at_utc = banned_at_utc;}
		
		public Object view_count;
		public Object getView_count() {return view_count;}
		public void setView_count(Object view_count) {this.view_count = view_count;}
		
		public boolean archived;
		public boolean isArchived() {return archived;}
		public void setArchived(boolean archived) {this.archived = archived;}
		
		public boolean no_follow;
		public boolean isNo_follow() {return no_follow;}
		public void setNo_follow(boolean no_follow) {this.no_follow = no_follow;}
		
		public boolean is_crosspostable;
		public boolean isIs_crosspostable() {return is_crosspostable;}
		public void setIs_crosspostable(boolean is_crosspostable) {this.is_crosspostable = is_crosspostable;}
		
		public boolean pinned;
		public boolean isPinned() {return pinned;}
		public void setPinned(boolean pinned) {this.pinned = pinned;}
		
		public boolean over_18;
		public boolean isOver_18() {return over_18;}
		public void setOver_18(boolean over_18) {this.over_18 = over_18;}
		
		public List<Object> all_awardings;
		public List<Object> getAll_awardings() {return all_awardings;}
		public void setAll_awardings(List<Object> all_awardings) {this.all_awardings = all_awardings;}
		
		public boolean media_only;
		public boolean isMedia_only() {return media_only;}
		public void setMedia_only(boolean media_only) {this.media_only = media_only;}
		
		public boolean can_gild;
		public boolean isCan_gild() {return can_gild;}
		public void setCan_gild(boolean can_gild) {this.can_gild = can_gild;}
		
		public boolean spoiler;
		public boolean isSpoiler() {return spoiler;}
		public void setSpoiler(boolean spoiler) {this.spoiler = spoiler;}
		
		public boolean locked;
		public boolean isLocked() {return locked;}
		public void setLocked(boolean locked) {this.locked = locked;}
		
		public String author_flair_text;
		public String getAuthor_flair_text() {return author_flair_text;}
		public void setAuthor_flair_text(String author_flair_text) {this.author_flair_text = author_flair_text;}
		
		public boolean visited;
		public boolean isVisited() {return visited;}
		public void setVisited(boolean visited) {this.visited = visited;}
		
		public Object num_reports;
		public Object getNum_reports() {return num_reports;}
		public void setNum_reports(Object num_reports) {this.num_reports = num_reports;}
		
		public String distinguished;
		public String getDistinguished() {return distinguished;}
		public void setDistinguished(String distinguished) {this.distinguished = distinguished;}
		
		public String subreddit_id;
		public String getSubreddit_id() {return subreddit_id;}
		public void setSubreddit_id(String subreddit_id) {this.subreddit_id = subreddit_id;}
		
		public Object mod_reason_by;
		public Object getMod_reason_by() {return mod_reason_by;}
		public void setMod_reason_by(Object mod_reason_by) {this.mod_reason_by = mod_reason_by;}
		
		public Object removal_reason;
		public Object getRemoval_reason() {return removal_reason;}
		public void setRemoval_reason(Object removal_reason) {this.removal_reason = removal_reason;}
		
		public String link_flair_background_color;
		public String getLink_flair_background_color() {return link_flair_background_color;}
		public void setLink_flair_background_color(String link_flair_background_color) {this.link_flair_background_color = link_flair_background_color;}
		
		public String id;
		public String getId() {return id;}
		public void setId(String id) {this.id = id;}
		
		public boolean is_robot_indexable;
		public boolean isIs_robot_indexable() {return is_robot_indexable;}
		public void setIs_robot_indexable(boolean is_robot_indexable) {this.is_robot_indexable = is_robot_indexable;}
		
		public Object report_reasons;
		public Object getReport_reasons() {return report_reasons;}
		public void setReport_reasons(Object report_reasons) {this.report_reasons = report_reasons;}
		
		public String author;
		public String getAuthor() {return author;}
		public void setAuthor(String author) {this.author = author;}
		
		public int num_crossposts;
		public int getNum_crossposts() {return num_crossposts;}
		public void setNum_crossposts(int num_crossposts) {this.num_crossposts = num_crossposts;}
		
		public int num_comments;
		public int getNum_comments() {return num_comments;}
		public void setNum_comments(int num_comments) {this.num_comments = num_comments;}
		
		public boolean send_replies;
		public boolean isSend_replies() {return send_replies;}
		public void setSend_replies(boolean send_replies) {this.send_replies = send_replies;}
		
		public String whitelist_status;
		public String getWhitelist_status() {return whitelist_status;}
		public void setWhitelist_status(String whitelist_status) {this.whitelist_status = whitelist_status;}
		
		public boolean contest_mode;
		public boolean isContest_mode() {return contest_mode;}
		public void setContest_mode(boolean contest_mode) {this.contest_mode = contest_mode;}
		
		public List<Object> mod_reports;
		public List<Object> getMod_reports() {return mod_reports;}
		public void setMod_reports(List<Object> mod_reports) {this.mod_reports = mod_reports;}
		
		public boolean author_patreon_flair;
		public boolean isAuthor_patreon_flair() {return author_patreon_flair;}
		public void setAuthor_patreon_flair(boolean author_patreon_flair) {this.author_patreon_flair = author_patreon_flair;}
		
		public String author_flair_text_color;
		public String getAuthor_flair_text_color() {return author_flair_text_color;}
		public void setAuthor_flair_text_color(String author_flair_text_color) {this.author_flair_text_color = author_flair_text_color;}
		
		public String permalink;
		public String getPermalink() {return permalink;}
		public void setPermalink(String permalink) {this.permalink = permalink;}
		
		public String parent_whitelist_status;
		public String getParent_whitelist_status() {return parent_whitelist_status;}
		public void setParent_whitelist_status(String parent_whitelist_status) {this.parent_whitelist_status = parent_whitelist_status;}
		
		public boolean stickied;
		public boolean isStickied() {return stickied;}
		public void setStickied(boolean stickied) {this.stickied = stickied;}
		
		public String url;
		public String getUrl() {return url;}
		public void setUrl(String url) {this.url = url;}
		
		public int subreddit_subscribers;
		public int getSubreddit_subscribers() {return subreddit_subscribers;}
		public void setSubreddit_subscribers(int subreddit_subscribers) {this.subreddit_subscribers = subreddit_subscribers;}
		
		public double created_utc;
		public double getCreated_utc() {return created_utc;}
		public void setCreated_utc(double created_utc) {this.created_utc = created_utc;}
		
		public Media media;
		public Media getMedia() {return media;}
		public void setMedia(Media media) {this.media = media;}
		
		public boolean is_video;
		public boolean isIs_video() {return is_video;}
		public void setIs_video(boolean is_video) {this.is_video = is_video;}
		
		public String post_hint;
		public String getPost_hint() {return post_hint;}
		public void setPost_hint(String post_hint) {this.post_hint = post_hint;}
		
		public Preview preview;
		public Preview getPreview() {return preview;}
		public void setPreview(Preview preview) {this.preview = preview;}
		
		public String link_flair_template_id;
		public String getLink_flair_template_id() {return link_flair_template_id;}
		public void setLink_flair_template_id(String link_flair_template_id) {this.link_flair_template_id = link_flair_template_id;}
		
	}

	public static class Child
	{
		public String kind;
	    public String getKind() {return kind;}
		public void setKind(String kind) {this.kind = kind;}
		
		public Data2 data;
		public Data2 getData() {return data;}
		public void setData(Data2 data) {this.data = data;}
	}

	public static class Data
	{
		public String modhash;
	    public String getModhash() {return modhash;}
		public void setModhash(String modhash) {this.modhash = modhash;}
		
		public int dist;
		public int getDist() {return dist;}
		public void setDist(int dist) {this.dist = dist;}
		
		public List<Child> children;
		public List<Child> getChildren() {return children;}
		public void setChildren(List<Child> children) {this.children = children;}
		
		public String after;
		public String getAfter() {return after;}
		public void setAfter(String after) {this.after = after;}
		
		public Object before;
		public Object getBefore() {return before;}
		public void setBefore(Object before) {this.before = before;}
	}

}
