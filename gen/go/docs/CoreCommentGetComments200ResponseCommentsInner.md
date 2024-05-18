# CoreCommentGetComments200ResponseCommentsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Avatar** | Pointer to **string** | HTML user picture | [optional] [default to "null"]
**Content** | Pointer to **string** | The content text formatted | [optional] [default to "null"]
**Delete** | Pointer to **bool** | Permission to delete&#x3D;true/false | [optional] [default to null]
**Format** | Pointer to **int32** | content format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Fullname** | Pointer to **string** | fullname | [optional] [default to "null"]
**Id** | Pointer to **int32** | Comment ID | [optional] [default to null]
**Profileurl** | Pointer to **string** | URL profile | [optional] [default to "null"]
**Strftimeformat** | Pointer to **string** | Time format | [optional] [default to "null"]
**Time** | Pointer to **string** | Time in human format | [optional] [default to "null"]
**Timecreated** | Pointer to **int32** | Time created (timestamp) | [optional] [default to null]
**Userid** | Pointer to **int32** | User ID | [optional] 

## Methods

### NewCoreCommentGetComments200ResponseCommentsInner

`func NewCoreCommentGetComments200ResponseCommentsInner() *CoreCommentGetComments200ResponseCommentsInner`

NewCoreCommentGetComments200ResponseCommentsInner instantiates a new CoreCommentGetComments200ResponseCommentsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCommentGetComments200ResponseCommentsInnerWithDefaults

`func NewCoreCommentGetComments200ResponseCommentsInnerWithDefaults() *CoreCommentGetComments200ResponseCommentsInner`

NewCoreCommentGetComments200ResponseCommentsInnerWithDefaults instantiates a new CoreCommentGetComments200ResponseCommentsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAvatar

`func (o *CoreCommentGetComments200ResponseCommentsInner) GetAvatar() string`

GetAvatar returns the Avatar field if non-nil, zero value otherwise.

### GetAvatarOk

`func (o *CoreCommentGetComments200ResponseCommentsInner) GetAvatarOk() (*string, bool)`

GetAvatarOk returns a tuple with the Avatar field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvatar

`func (o *CoreCommentGetComments200ResponseCommentsInner) SetAvatar(v string)`

SetAvatar sets Avatar field to given value.

### HasAvatar

`func (o *CoreCommentGetComments200ResponseCommentsInner) HasAvatar() bool`

HasAvatar returns a boolean if a field has been set.

### GetContent

`func (o *CoreCommentGetComments200ResponseCommentsInner) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *CoreCommentGetComments200ResponseCommentsInner) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *CoreCommentGetComments200ResponseCommentsInner) SetContent(v string)`

SetContent sets Content field to given value.

### HasContent

`func (o *CoreCommentGetComments200ResponseCommentsInner) HasContent() bool`

HasContent returns a boolean if a field has been set.

### GetDelete

`func (o *CoreCommentGetComments200ResponseCommentsInner) GetDelete() bool`

GetDelete returns the Delete field if non-nil, zero value otherwise.

### GetDeleteOk

`func (o *CoreCommentGetComments200ResponseCommentsInner) GetDeleteOk() (*bool, bool)`

GetDeleteOk returns a tuple with the Delete field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDelete

`func (o *CoreCommentGetComments200ResponseCommentsInner) SetDelete(v bool)`

SetDelete sets Delete field to given value.

### HasDelete

`func (o *CoreCommentGetComments200ResponseCommentsInner) HasDelete() bool`

HasDelete returns a boolean if a field has been set.

### GetFormat

`func (o *CoreCommentGetComments200ResponseCommentsInner) GetFormat() int32`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *CoreCommentGetComments200ResponseCommentsInner) GetFormatOk() (*int32, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *CoreCommentGetComments200ResponseCommentsInner) SetFormat(v int32)`

SetFormat sets Format field to given value.

### HasFormat

`func (o *CoreCommentGetComments200ResponseCommentsInner) HasFormat() bool`

HasFormat returns a boolean if a field has been set.

### GetFullname

`func (o *CoreCommentGetComments200ResponseCommentsInner) GetFullname() string`

GetFullname returns the Fullname field if non-nil, zero value otherwise.

### GetFullnameOk

`func (o *CoreCommentGetComments200ResponseCommentsInner) GetFullnameOk() (*string, bool)`

GetFullnameOk returns a tuple with the Fullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullname

`func (o *CoreCommentGetComments200ResponseCommentsInner) SetFullname(v string)`

SetFullname sets Fullname field to given value.

### HasFullname

`func (o *CoreCommentGetComments200ResponseCommentsInner) HasFullname() bool`

HasFullname returns a boolean if a field has been set.

### GetId

`func (o *CoreCommentGetComments200ResponseCommentsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCommentGetComments200ResponseCommentsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCommentGetComments200ResponseCommentsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreCommentGetComments200ResponseCommentsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetProfileurl

`func (o *CoreCommentGetComments200ResponseCommentsInner) GetProfileurl() string`

GetProfileurl returns the Profileurl field if non-nil, zero value otherwise.

### GetProfileurlOk

`func (o *CoreCommentGetComments200ResponseCommentsInner) GetProfileurlOk() (*string, bool)`

GetProfileurlOk returns a tuple with the Profileurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfileurl

`func (o *CoreCommentGetComments200ResponseCommentsInner) SetProfileurl(v string)`

SetProfileurl sets Profileurl field to given value.

### HasProfileurl

`func (o *CoreCommentGetComments200ResponseCommentsInner) HasProfileurl() bool`

HasProfileurl returns a boolean if a field has been set.

### GetStrftimeformat

`func (o *CoreCommentGetComments200ResponseCommentsInner) GetStrftimeformat() string`

GetStrftimeformat returns the Strftimeformat field if non-nil, zero value otherwise.

### GetStrftimeformatOk

`func (o *CoreCommentGetComments200ResponseCommentsInner) GetStrftimeformatOk() (*string, bool)`

GetStrftimeformatOk returns a tuple with the Strftimeformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStrftimeformat

`func (o *CoreCommentGetComments200ResponseCommentsInner) SetStrftimeformat(v string)`

SetStrftimeformat sets Strftimeformat field to given value.

### HasStrftimeformat

`func (o *CoreCommentGetComments200ResponseCommentsInner) HasStrftimeformat() bool`

HasStrftimeformat returns a boolean if a field has been set.

### GetTime

`func (o *CoreCommentGetComments200ResponseCommentsInner) GetTime() string`

GetTime returns the Time field if non-nil, zero value otherwise.

### GetTimeOk

`func (o *CoreCommentGetComments200ResponseCommentsInner) GetTimeOk() (*string, bool)`

GetTimeOk returns a tuple with the Time field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTime

`func (o *CoreCommentGetComments200ResponseCommentsInner) SetTime(v string)`

SetTime sets Time field to given value.

### HasTime

`func (o *CoreCommentGetComments200ResponseCommentsInner) HasTime() bool`

HasTime returns a boolean if a field has been set.

### GetTimecreated

`func (o *CoreCommentGetComments200ResponseCommentsInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *CoreCommentGetComments200ResponseCommentsInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *CoreCommentGetComments200ResponseCommentsInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *CoreCommentGetComments200ResponseCommentsInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetUserid

`func (o *CoreCommentGetComments200ResponseCommentsInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreCommentGetComments200ResponseCommentsInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreCommentGetComments200ResponseCommentsInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreCommentGetComments200ResponseCommentsInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


