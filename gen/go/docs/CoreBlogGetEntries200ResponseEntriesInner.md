# CoreBlogGetEntries200ResponseEntriesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attachment** | Pointer to **string** | Post atachment. | [optional] [default to "null"]
**Attachmentfiles** | Pointer to [**[]CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner**](CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner.md) |  | [optional] 
**Content** | Pointer to **string** | Post content. | [optional] [default to "null"]
**Courseid** | Pointer to **int32** | Course where the post was created. | [optional] [default to 0]
**Coursemoduleid** | Pointer to **int32** | Course module id where the post was created. | [optional] [default to 0]
**Created** | Pointer to **int32** | When it was created. | [optional] [default to 0]
**Format** | Pointer to **int32** | Post content format. | [optional] [default to 0]
**Groupid** | Pointer to **int32** | Group post was created for. | [optional] [default to 0]
**Id** | Pointer to **int32** | Post/entry id. | [optional] [default to null]
**Lastmodified** | Pointer to **int32** | When it was last modified. | [optional] [default to 0]
**Module** | Pointer to **string** | Where it was published the post (blog, blog_external...). | [optional] [default to "null"]
**Moduleid** | Pointer to **int32** | Module id where the post was created (not used anymore). | [optional] [default to 0]
**Publishstate** | Pointer to **string** | Post publish state. | [optional] [default to "draft"]
**Rating** | Pointer to **int32** | Post rating. | [optional] [default to 0]
**Subject** | Pointer to **string** | Post subject. | [optional] [default to "null"]
**Summary** | Pointer to **string** | Post summary. | [optional] [default to "null"]
**Summaryfiles** | Pointer to [**[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**Summaryformat** | Pointer to **int32** | summary format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Tags** | Pointer to [**[]CoreBlogGetEntries200ResponseEntriesInnerTagsInner**](CoreBlogGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional] 
**Uniquehash** | Pointer to **string** | Post unique hash. | [optional] [default to "null"]
**Userid** | Pointer to **int32** | Post author. | [optional] [default to 0]
**Usermodified** | Pointer to **int32** | User that updated the post. | [optional] [default to null]

## Methods

### NewCoreBlogGetEntries200ResponseEntriesInner

`func NewCoreBlogGetEntries200ResponseEntriesInner() *CoreBlogGetEntries200ResponseEntriesInner`

NewCoreBlogGetEntries200ResponseEntriesInner instantiates a new CoreBlogGetEntries200ResponseEntriesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreBlogGetEntries200ResponseEntriesInnerWithDefaults

`func NewCoreBlogGetEntries200ResponseEntriesInnerWithDefaults() *CoreBlogGetEntries200ResponseEntriesInner`

NewCoreBlogGetEntries200ResponseEntriesInnerWithDefaults instantiates a new CoreBlogGetEntries200ResponseEntriesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttachment

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetAttachment() string`

GetAttachment returns the Attachment field if non-nil, zero value otherwise.

### GetAttachmentOk

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetAttachmentOk() (*string, bool)`

GetAttachmentOk returns a tuple with the Attachment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachment

`func (o *CoreBlogGetEntries200ResponseEntriesInner) SetAttachment(v string)`

SetAttachment sets Attachment field to given value.

### HasAttachment

`func (o *CoreBlogGetEntries200ResponseEntriesInner) HasAttachment() bool`

HasAttachment returns a boolean if a field has been set.

### GetAttachmentfiles

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetAttachmentfiles() []CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner`

GetAttachmentfiles returns the Attachmentfiles field if non-nil, zero value otherwise.

### GetAttachmentfilesOk

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetAttachmentfilesOk() (*[]CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner, bool)`

GetAttachmentfilesOk returns a tuple with the Attachmentfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachmentfiles

`func (o *CoreBlogGetEntries200ResponseEntriesInner) SetAttachmentfiles(v []CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner)`

SetAttachmentfiles sets Attachmentfiles field to given value.

### HasAttachmentfiles

`func (o *CoreBlogGetEntries200ResponseEntriesInner) HasAttachmentfiles() bool`

HasAttachmentfiles returns a boolean if a field has been set.

### GetContent

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *CoreBlogGetEntries200ResponseEntriesInner) SetContent(v string)`

SetContent sets Content field to given value.

### HasContent

`func (o *CoreBlogGetEntries200ResponseEntriesInner) HasContent() bool`

HasContent returns a boolean if a field has been set.

### GetCourseid

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreBlogGetEntries200ResponseEntriesInner) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *CoreBlogGetEntries200ResponseEntriesInner) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetCoursemoduleid

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetCoursemoduleid() int32`

GetCoursemoduleid returns the Coursemoduleid field if non-nil, zero value otherwise.

### GetCoursemoduleidOk

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetCoursemoduleidOk() (*int32, bool)`

GetCoursemoduleidOk returns a tuple with the Coursemoduleid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursemoduleid

`func (o *CoreBlogGetEntries200ResponseEntriesInner) SetCoursemoduleid(v int32)`

SetCoursemoduleid sets Coursemoduleid field to given value.

### HasCoursemoduleid

`func (o *CoreBlogGetEntries200ResponseEntriesInner) HasCoursemoduleid() bool`

HasCoursemoduleid returns a boolean if a field has been set.

### GetCreated

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetCreated() int32`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetCreatedOk() (*int32, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *CoreBlogGetEntries200ResponseEntriesInner) SetCreated(v int32)`

SetCreated sets Created field to given value.

### HasCreated

`func (o *CoreBlogGetEntries200ResponseEntriesInner) HasCreated() bool`

HasCreated returns a boolean if a field has been set.

### GetFormat

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetFormat() int32`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetFormatOk() (*int32, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *CoreBlogGetEntries200ResponseEntriesInner) SetFormat(v int32)`

SetFormat sets Format field to given value.

### HasFormat

`func (o *CoreBlogGetEntries200ResponseEntriesInner) HasFormat() bool`

HasFormat returns a boolean if a field has been set.

### GetGroupid

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *CoreBlogGetEntries200ResponseEntriesInner) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *CoreBlogGetEntries200ResponseEntriesInner) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetId

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreBlogGetEntries200ResponseEntriesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreBlogGetEntries200ResponseEntriesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetLastmodified

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetLastmodified() int32`

GetLastmodified returns the Lastmodified field if non-nil, zero value otherwise.

### GetLastmodifiedOk

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetLastmodifiedOk() (*int32, bool)`

GetLastmodifiedOk returns a tuple with the Lastmodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastmodified

`func (o *CoreBlogGetEntries200ResponseEntriesInner) SetLastmodified(v int32)`

SetLastmodified sets Lastmodified field to given value.

### HasLastmodified

`func (o *CoreBlogGetEntries200ResponseEntriesInner) HasLastmodified() bool`

HasLastmodified returns a boolean if a field has been set.

### GetModule

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetModule() string`

GetModule returns the Module field if non-nil, zero value otherwise.

### GetModuleOk

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetModuleOk() (*string, bool)`

GetModuleOk returns a tuple with the Module field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModule

`func (o *CoreBlogGetEntries200ResponseEntriesInner) SetModule(v string)`

SetModule sets Module field to given value.

### HasModule

`func (o *CoreBlogGetEntries200ResponseEntriesInner) HasModule() bool`

HasModule returns a boolean if a field has been set.

### GetModuleid

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetModuleid() int32`

GetModuleid returns the Moduleid field if non-nil, zero value otherwise.

### GetModuleidOk

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetModuleidOk() (*int32, bool)`

GetModuleidOk returns a tuple with the Moduleid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModuleid

`func (o *CoreBlogGetEntries200ResponseEntriesInner) SetModuleid(v int32)`

SetModuleid sets Moduleid field to given value.

### HasModuleid

`func (o *CoreBlogGetEntries200ResponseEntriesInner) HasModuleid() bool`

HasModuleid returns a boolean if a field has been set.

### GetPublishstate

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetPublishstate() string`

GetPublishstate returns the Publishstate field if non-nil, zero value otherwise.

### GetPublishstateOk

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetPublishstateOk() (*string, bool)`

GetPublishstateOk returns a tuple with the Publishstate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPublishstate

`func (o *CoreBlogGetEntries200ResponseEntriesInner) SetPublishstate(v string)`

SetPublishstate sets Publishstate field to given value.

### HasPublishstate

`func (o *CoreBlogGetEntries200ResponseEntriesInner) HasPublishstate() bool`

HasPublishstate returns a boolean if a field has been set.

### GetRating

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetRating() int32`

GetRating returns the Rating field if non-nil, zero value otherwise.

### GetRatingOk

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetRatingOk() (*int32, bool)`

GetRatingOk returns a tuple with the Rating field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRating

`func (o *CoreBlogGetEntries200ResponseEntriesInner) SetRating(v int32)`

SetRating sets Rating field to given value.

### HasRating

`func (o *CoreBlogGetEntries200ResponseEntriesInner) HasRating() bool`

HasRating returns a boolean if a field has been set.

### GetSubject

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetSubject() string`

GetSubject returns the Subject field if non-nil, zero value otherwise.

### GetSubjectOk

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetSubjectOk() (*string, bool)`

GetSubjectOk returns a tuple with the Subject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubject

`func (o *CoreBlogGetEntries200ResponseEntriesInner) SetSubject(v string)`

SetSubject sets Subject field to given value.

### HasSubject

`func (o *CoreBlogGetEntries200ResponseEntriesInner) HasSubject() bool`

HasSubject returns a boolean if a field has been set.

### GetSummary

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetSummary() string`

GetSummary returns the Summary field if non-nil, zero value otherwise.

### GetSummaryOk

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetSummaryOk() (*string, bool)`

GetSummaryOk returns a tuple with the Summary field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummary

`func (o *CoreBlogGetEntries200ResponseEntriesInner) SetSummary(v string)`

SetSummary sets Summary field to given value.

### HasSummary

`func (o *CoreBlogGetEntries200ResponseEntriesInner) HasSummary() bool`

HasSummary returns a boolean if a field has been set.

### GetSummaryfiles

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetSummaryfiles() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner`

GetSummaryfiles returns the Summaryfiles field if non-nil, zero value otherwise.

### GetSummaryfilesOk

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetSummaryfilesOk() (*[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool)`

GetSummaryfilesOk returns a tuple with the Summaryfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummaryfiles

`func (o *CoreBlogGetEntries200ResponseEntriesInner) SetSummaryfiles(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner)`

SetSummaryfiles sets Summaryfiles field to given value.

### HasSummaryfiles

`func (o *CoreBlogGetEntries200ResponseEntriesInner) HasSummaryfiles() bool`

HasSummaryfiles returns a boolean if a field has been set.

### GetSummaryformat

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetSummaryformat() int32`

GetSummaryformat returns the Summaryformat field if non-nil, zero value otherwise.

### GetSummaryformatOk

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetSummaryformatOk() (*int32, bool)`

GetSummaryformatOk returns a tuple with the Summaryformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummaryformat

`func (o *CoreBlogGetEntries200ResponseEntriesInner) SetSummaryformat(v int32)`

SetSummaryformat sets Summaryformat field to given value.

### HasSummaryformat

`func (o *CoreBlogGetEntries200ResponseEntriesInner) HasSummaryformat() bool`

HasSummaryformat returns a boolean if a field has been set.

### GetTags

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetTags() []CoreBlogGetEntries200ResponseEntriesInnerTagsInner`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetTagsOk() (*[]CoreBlogGetEntries200ResponseEntriesInnerTagsInner, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *CoreBlogGetEntries200ResponseEntriesInner) SetTags(v []CoreBlogGetEntries200ResponseEntriesInnerTagsInner)`

SetTags sets Tags field to given value.

### HasTags

`func (o *CoreBlogGetEntries200ResponseEntriesInner) HasTags() bool`

HasTags returns a boolean if a field has been set.

### GetUniquehash

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetUniquehash() string`

GetUniquehash returns the Uniquehash field if non-nil, zero value otherwise.

### GetUniquehashOk

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetUniquehashOk() (*string, bool)`

GetUniquehashOk returns a tuple with the Uniquehash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUniquehash

`func (o *CoreBlogGetEntries200ResponseEntriesInner) SetUniquehash(v string)`

SetUniquehash sets Uniquehash field to given value.

### HasUniquehash

`func (o *CoreBlogGetEntries200ResponseEntriesInner) HasUniquehash() bool`

HasUniquehash returns a boolean if a field has been set.

### GetUserid

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreBlogGetEntries200ResponseEntriesInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreBlogGetEntries200ResponseEntriesInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetUsermodified

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *CoreBlogGetEntries200ResponseEntriesInner) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *CoreBlogGetEntries200ResponseEntriesInner) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.

### HasUsermodified

`func (o *CoreBlogGetEntries200ResponseEntriesInner) HasUsermodified() bool`

HasUsermodified returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


