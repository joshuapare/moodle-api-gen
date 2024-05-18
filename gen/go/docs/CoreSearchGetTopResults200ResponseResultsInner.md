# CoreSearchGetTopResults200ResponseResultsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Areaname** | Pointer to **string** | search area name | [optional] 
**Componentname** | Pointer to **string** | component name | [optional] 
**Content** | Pointer to **string** | result contents | [optional] [default to ""]
**Contextid** | Pointer to **int32** | result context id | [optional] 
**Contexturl** | Pointer to **string** | result context url | [optional] 
**Coursefullname** | Pointer to **string** | result course fullname | [optional] 
**Courseurl** | Pointer to **string** | result course url | [optional] 
**Description1** | Pointer to **string** | extra result contents, depends on the search area | [optional] [default to ""]
**Description2** | Pointer to **string** | extra result contents, depends on the search area | [optional] [default to ""]
**Docurl** | Pointer to **string** | result url | [optional] 
**Filename** | Pointer to **string** | result file name if present | [optional] 
**Filenames** | Pointer to **string** | result file names if present | [optional] 
**Iconurl** | Pointer to **string** | icon url | [optional] [default to ""]
**Itemid** | Pointer to **int32** | unique id in the search area scope | [optional] 
**Multiplefiles** | Pointer to **int32** | whether multiple files are returned or not | [optional] 
**Textformat** | Pointer to **int32** | text fields format, it is the same for all of them | [optional] 
**Timemodified** | Pointer to **int32** | result modified time | [optional] 
**Title** | Pointer to **string** | result title | [optional] 
**Userfullname** | Pointer to **string** | user fullname | [optional] 
**Userid** | Pointer to **int32** | user id | [optional] 
**Userurl** | Pointer to **string** | user url | [optional] 

## Methods

### NewCoreSearchGetTopResults200ResponseResultsInner

`func NewCoreSearchGetTopResults200ResponseResultsInner() *CoreSearchGetTopResults200ResponseResultsInner`

NewCoreSearchGetTopResults200ResponseResultsInner instantiates a new CoreSearchGetTopResults200ResponseResultsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreSearchGetTopResults200ResponseResultsInnerWithDefaults

`func NewCoreSearchGetTopResults200ResponseResultsInnerWithDefaults() *CoreSearchGetTopResults200ResponseResultsInner`

NewCoreSearchGetTopResults200ResponseResultsInnerWithDefaults instantiates a new CoreSearchGetTopResults200ResponseResultsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAreaname

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetAreaname() string`

GetAreaname returns the Areaname field if non-nil, zero value otherwise.

### GetAreanameOk

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetAreanameOk() (*string, bool)`

GetAreanameOk returns a tuple with the Areaname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAreaname

`func (o *CoreSearchGetTopResults200ResponseResultsInner) SetAreaname(v string)`

SetAreaname sets Areaname field to given value.

### HasAreaname

`func (o *CoreSearchGetTopResults200ResponseResultsInner) HasAreaname() bool`

HasAreaname returns a boolean if a field has been set.

### GetComponentname

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetComponentname() string`

GetComponentname returns the Componentname field if non-nil, zero value otherwise.

### GetComponentnameOk

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetComponentnameOk() (*string, bool)`

GetComponentnameOk returns a tuple with the Componentname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponentname

`func (o *CoreSearchGetTopResults200ResponseResultsInner) SetComponentname(v string)`

SetComponentname sets Componentname field to given value.

### HasComponentname

`func (o *CoreSearchGetTopResults200ResponseResultsInner) HasComponentname() bool`

HasComponentname returns a boolean if a field has been set.

### GetContent

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *CoreSearchGetTopResults200ResponseResultsInner) SetContent(v string)`

SetContent sets Content field to given value.

### HasContent

`func (o *CoreSearchGetTopResults200ResponseResultsInner) HasContent() bool`

HasContent returns a boolean if a field has been set.

### GetContextid

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreSearchGetTopResults200ResponseResultsInner) SetContextid(v int32)`

SetContextid sets Contextid field to given value.

### HasContextid

`func (o *CoreSearchGetTopResults200ResponseResultsInner) HasContextid() bool`

HasContextid returns a boolean if a field has been set.

### GetContexturl

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetContexturl() string`

GetContexturl returns the Contexturl field if non-nil, zero value otherwise.

### GetContexturlOk

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetContexturlOk() (*string, bool)`

GetContexturlOk returns a tuple with the Contexturl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContexturl

`func (o *CoreSearchGetTopResults200ResponseResultsInner) SetContexturl(v string)`

SetContexturl sets Contexturl field to given value.

### HasContexturl

`func (o *CoreSearchGetTopResults200ResponseResultsInner) HasContexturl() bool`

HasContexturl returns a boolean if a field has been set.

### GetCoursefullname

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetCoursefullname() string`

GetCoursefullname returns the Coursefullname field if non-nil, zero value otherwise.

### GetCoursefullnameOk

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetCoursefullnameOk() (*string, bool)`

GetCoursefullnameOk returns a tuple with the Coursefullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursefullname

`func (o *CoreSearchGetTopResults200ResponseResultsInner) SetCoursefullname(v string)`

SetCoursefullname sets Coursefullname field to given value.

### HasCoursefullname

`func (o *CoreSearchGetTopResults200ResponseResultsInner) HasCoursefullname() bool`

HasCoursefullname returns a boolean if a field has been set.

### GetCourseurl

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetCourseurl() string`

GetCourseurl returns the Courseurl field if non-nil, zero value otherwise.

### GetCourseurlOk

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetCourseurlOk() (*string, bool)`

GetCourseurlOk returns a tuple with the Courseurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseurl

`func (o *CoreSearchGetTopResults200ResponseResultsInner) SetCourseurl(v string)`

SetCourseurl sets Courseurl field to given value.

### HasCourseurl

`func (o *CoreSearchGetTopResults200ResponseResultsInner) HasCourseurl() bool`

HasCourseurl returns a boolean if a field has been set.

### GetDescription1

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetDescription1() string`

GetDescription1 returns the Description1 field if non-nil, zero value otherwise.

### GetDescription1Ok

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetDescription1Ok() (*string, bool)`

GetDescription1Ok returns a tuple with the Description1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription1

`func (o *CoreSearchGetTopResults200ResponseResultsInner) SetDescription1(v string)`

SetDescription1 sets Description1 field to given value.

### HasDescription1

`func (o *CoreSearchGetTopResults200ResponseResultsInner) HasDescription1() bool`

HasDescription1 returns a boolean if a field has been set.

### GetDescription2

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetDescription2() string`

GetDescription2 returns the Description2 field if non-nil, zero value otherwise.

### GetDescription2Ok

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetDescription2Ok() (*string, bool)`

GetDescription2Ok returns a tuple with the Description2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription2

`func (o *CoreSearchGetTopResults200ResponseResultsInner) SetDescription2(v string)`

SetDescription2 sets Description2 field to given value.

### HasDescription2

`func (o *CoreSearchGetTopResults200ResponseResultsInner) HasDescription2() bool`

HasDescription2 returns a boolean if a field has been set.

### GetDocurl

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetDocurl() string`

GetDocurl returns the Docurl field if non-nil, zero value otherwise.

### GetDocurlOk

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetDocurlOk() (*string, bool)`

GetDocurlOk returns a tuple with the Docurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDocurl

`func (o *CoreSearchGetTopResults200ResponseResultsInner) SetDocurl(v string)`

SetDocurl sets Docurl field to given value.

### HasDocurl

`func (o *CoreSearchGetTopResults200ResponseResultsInner) HasDocurl() bool`

HasDocurl returns a boolean if a field has been set.

### GetFilename

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetFilename() string`

GetFilename returns the Filename field if non-nil, zero value otherwise.

### GetFilenameOk

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetFilenameOk() (*string, bool)`

GetFilenameOk returns a tuple with the Filename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilename

`func (o *CoreSearchGetTopResults200ResponseResultsInner) SetFilename(v string)`

SetFilename sets Filename field to given value.

### HasFilename

`func (o *CoreSearchGetTopResults200ResponseResultsInner) HasFilename() bool`

HasFilename returns a boolean if a field has been set.

### GetFilenames

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetFilenames() string`

GetFilenames returns the Filenames field if non-nil, zero value otherwise.

### GetFilenamesOk

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetFilenamesOk() (*string, bool)`

GetFilenamesOk returns a tuple with the Filenames field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilenames

`func (o *CoreSearchGetTopResults200ResponseResultsInner) SetFilenames(v string)`

SetFilenames sets Filenames field to given value.

### HasFilenames

`func (o *CoreSearchGetTopResults200ResponseResultsInner) HasFilenames() bool`

HasFilenames returns a boolean if a field has been set.

### GetIconurl

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetIconurl() string`

GetIconurl returns the Iconurl field if non-nil, zero value otherwise.

### GetIconurlOk

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetIconurlOk() (*string, bool)`

GetIconurlOk returns a tuple with the Iconurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIconurl

`func (o *CoreSearchGetTopResults200ResponseResultsInner) SetIconurl(v string)`

SetIconurl sets Iconurl field to given value.

### HasIconurl

`func (o *CoreSearchGetTopResults200ResponseResultsInner) HasIconurl() bool`

HasIconurl returns a boolean if a field has been set.

### GetItemid

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetItemid() int32`

GetItemid returns the Itemid field if non-nil, zero value otherwise.

### GetItemidOk

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetItemidOk() (*int32, bool)`

GetItemidOk returns a tuple with the Itemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemid

`func (o *CoreSearchGetTopResults200ResponseResultsInner) SetItemid(v int32)`

SetItemid sets Itemid field to given value.

### HasItemid

`func (o *CoreSearchGetTopResults200ResponseResultsInner) HasItemid() bool`

HasItemid returns a boolean if a field has been set.

### GetMultiplefiles

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetMultiplefiles() int32`

GetMultiplefiles returns the Multiplefiles field if non-nil, zero value otherwise.

### GetMultiplefilesOk

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetMultiplefilesOk() (*int32, bool)`

GetMultiplefilesOk returns a tuple with the Multiplefiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMultiplefiles

`func (o *CoreSearchGetTopResults200ResponseResultsInner) SetMultiplefiles(v int32)`

SetMultiplefiles sets Multiplefiles field to given value.

### HasMultiplefiles

`func (o *CoreSearchGetTopResults200ResponseResultsInner) HasMultiplefiles() bool`

HasMultiplefiles returns a boolean if a field has been set.

### GetTextformat

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetTextformat() int32`

GetTextformat returns the Textformat field if non-nil, zero value otherwise.

### GetTextformatOk

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetTextformatOk() (*int32, bool)`

GetTextformatOk returns a tuple with the Textformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTextformat

`func (o *CoreSearchGetTopResults200ResponseResultsInner) SetTextformat(v int32)`

SetTextformat sets Textformat field to given value.

### HasTextformat

`func (o *CoreSearchGetTopResults200ResponseResultsInner) HasTextformat() bool`

HasTextformat returns a boolean if a field has been set.

### GetTimemodified

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreSearchGetTopResults200ResponseResultsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *CoreSearchGetTopResults200ResponseResultsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetTitle

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *CoreSearchGetTopResults200ResponseResultsInner) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *CoreSearchGetTopResults200ResponseResultsInner) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### GetUserfullname

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetUserfullname() string`

GetUserfullname returns the Userfullname field if non-nil, zero value otherwise.

### GetUserfullnameOk

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetUserfullnameOk() (*string, bool)`

GetUserfullnameOk returns a tuple with the Userfullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserfullname

`func (o *CoreSearchGetTopResults200ResponseResultsInner) SetUserfullname(v string)`

SetUserfullname sets Userfullname field to given value.

### HasUserfullname

`func (o *CoreSearchGetTopResults200ResponseResultsInner) HasUserfullname() bool`

HasUserfullname returns a boolean if a field has been set.

### GetUserid

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreSearchGetTopResults200ResponseResultsInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreSearchGetTopResults200ResponseResultsInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetUserurl

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetUserurl() string`

GetUserurl returns the Userurl field if non-nil, zero value otherwise.

### GetUserurlOk

`func (o *CoreSearchGetTopResults200ResponseResultsInner) GetUserurlOk() (*string, bool)`

GetUserurlOk returns a tuple with the Userurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserurl

`func (o *CoreSearchGetTopResults200ResponseResultsInner) SetUserurl(v string)`

SetUserurl sets Userurl field to given value.

### HasUserurl

`func (o *CoreSearchGetTopResults200ResponseResultsInner) HasUserurl() bool`

HasUserurl returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


