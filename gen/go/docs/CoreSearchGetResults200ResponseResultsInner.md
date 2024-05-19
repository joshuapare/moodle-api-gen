# CoreSearchGetResults200ResponseResultsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Areaname** | Pointer to **string** | search area name | [optional] [default to "null"]
**Componentname** | Pointer to **string** | component name | [optional] [default to "null"]
**Content** | Pointer to **string** | result contents | [optional] [default to ""]
**Contextid** | Pointer to **int32** | result context id | [optional] [default to null]
**Contexturl** | Pointer to **string** | result context url | [optional] [default to "null"]
**Coursefullname** | Pointer to **string** | result course fullname | [optional] [default to "null"]
**Courseurl** | Pointer to **string** | result course url | [optional] [default to "null"]
**Description1** | Pointer to **string** | extra result contents, depends on the search area | [optional] [default to ""]
**Description2** | Pointer to **string** | extra result contents, depends on the search area | [optional] [default to ""]
**Docurl** | Pointer to **string** | result url | [optional] [default to "null"]
**Filename** | Pointer to **string** | result file name if present | [optional] [default to "null"]
**Filenames** | Pointer to **string** | result file names if present | [optional] [default to "null"]
**Iconurl** | Pointer to **string** | icon url | [optional] [default to ""]
**Itemid** | Pointer to **int32** | unique id in the search area scope | [optional] [default to null]
**Multiplefiles** | Pointer to **int32** | whether multiple files are returned or not | [optional] [default to null]
**Textformat** | Pointer to **int32** | text fields format, it is the same for all of them | [optional] [default to null]
**Timemodified** | Pointer to **int32** | result modified time | [optional] [default to null]
**Title** | Pointer to **string** | result title | [optional] [default to "null"]
**Userfullname** | Pointer to **string** | user fullname | [optional] [default to "null"]
**Userid** | Pointer to **int32** | user id | [optional] [default to null]
**Userurl** | Pointer to **string** | user url | [optional] [default to "null"]

## Methods

### NewCoreSearchGetResults200ResponseResultsInner

`func NewCoreSearchGetResults200ResponseResultsInner() *CoreSearchGetResults200ResponseResultsInner`

NewCoreSearchGetResults200ResponseResultsInner instantiates a new CoreSearchGetResults200ResponseResultsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreSearchGetResults200ResponseResultsInnerWithDefaults

`func NewCoreSearchGetResults200ResponseResultsInnerWithDefaults() *CoreSearchGetResults200ResponseResultsInner`

NewCoreSearchGetResults200ResponseResultsInnerWithDefaults instantiates a new CoreSearchGetResults200ResponseResultsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAreaname

`func (o *CoreSearchGetResults200ResponseResultsInner) GetAreaname() string`

GetAreaname returns the Areaname field if non-nil, zero value otherwise.

### GetAreanameOk

`func (o *CoreSearchGetResults200ResponseResultsInner) GetAreanameOk() (*string, bool)`

GetAreanameOk returns a tuple with the Areaname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAreaname

`func (o *CoreSearchGetResults200ResponseResultsInner) SetAreaname(v string)`

SetAreaname sets Areaname field to given value.

### HasAreaname

`func (o *CoreSearchGetResults200ResponseResultsInner) HasAreaname() bool`

HasAreaname returns a boolean if a field has been set.

### GetComponentname

`func (o *CoreSearchGetResults200ResponseResultsInner) GetComponentname() string`

GetComponentname returns the Componentname field if non-nil, zero value otherwise.

### GetComponentnameOk

`func (o *CoreSearchGetResults200ResponseResultsInner) GetComponentnameOk() (*string, bool)`

GetComponentnameOk returns a tuple with the Componentname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponentname

`func (o *CoreSearchGetResults200ResponseResultsInner) SetComponentname(v string)`

SetComponentname sets Componentname field to given value.

### HasComponentname

`func (o *CoreSearchGetResults200ResponseResultsInner) HasComponentname() bool`

HasComponentname returns a boolean if a field has been set.

### GetContent

`func (o *CoreSearchGetResults200ResponseResultsInner) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *CoreSearchGetResults200ResponseResultsInner) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *CoreSearchGetResults200ResponseResultsInner) SetContent(v string)`

SetContent sets Content field to given value.

### HasContent

`func (o *CoreSearchGetResults200ResponseResultsInner) HasContent() bool`

HasContent returns a boolean if a field has been set.

### GetContextid

`func (o *CoreSearchGetResults200ResponseResultsInner) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreSearchGetResults200ResponseResultsInner) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreSearchGetResults200ResponseResultsInner) SetContextid(v int32)`

SetContextid sets Contextid field to given value.

### HasContextid

`func (o *CoreSearchGetResults200ResponseResultsInner) HasContextid() bool`

HasContextid returns a boolean if a field has been set.

### GetContexturl

`func (o *CoreSearchGetResults200ResponseResultsInner) GetContexturl() string`

GetContexturl returns the Contexturl field if non-nil, zero value otherwise.

### GetContexturlOk

`func (o *CoreSearchGetResults200ResponseResultsInner) GetContexturlOk() (*string, bool)`

GetContexturlOk returns a tuple with the Contexturl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContexturl

`func (o *CoreSearchGetResults200ResponseResultsInner) SetContexturl(v string)`

SetContexturl sets Contexturl field to given value.

### HasContexturl

`func (o *CoreSearchGetResults200ResponseResultsInner) HasContexturl() bool`

HasContexturl returns a boolean if a field has been set.

### GetCoursefullname

`func (o *CoreSearchGetResults200ResponseResultsInner) GetCoursefullname() string`

GetCoursefullname returns the Coursefullname field if non-nil, zero value otherwise.

### GetCoursefullnameOk

`func (o *CoreSearchGetResults200ResponseResultsInner) GetCoursefullnameOk() (*string, bool)`

GetCoursefullnameOk returns a tuple with the Coursefullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursefullname

`func (o *CoreSearchGetResults200ResponseResultsInner) SetCoursefullname(v string)`

SetCoursefullname sets Coursefullname field to given value.

### HasCoursefullname

`func (o *CoreSearchGetResults200ResponseResultsInner) HasCoursefullname() bool`

HasCoursefullname returns a boolean if a field has been set.

### GetCourseurl

`func (o *CoreSearchGetResults200ResponseResultsInner) GetCourseurl() string`

GetCourseurl returns the Courseurl field if non-nil, zero value otherwise.

### GetCourseurlOk

`func (o *CoreSearchGetResults200ResponseResultsInner) GetCourseurlOk() (*string, bool)`

GetCourseurlOk returns a tuple with the Courseurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseurl

`func (o *CoreSearchGetResults200ResponseResultsInner) SetCourseurl(v string)`

SetCourseurl sets Courseurl field to given value.

### HasCourseurl

`func (o *CoreSearchGetResults200ResponseResultsInner) HasCourseurl() bool`

HasCourseurl returns a boolean if a field has been set.

### GetDescription1

`func (o *CoreSearchGetResults200ResponseResultsInner) GetDescription1() string`

GetDescription1 returns the Description1 field if non-nil, zero value otherwise.

### GetDescription1Ok

`func (o *CoreSearchGetResults200ResponseResultsInner) GetDescription1Ok() (*string, bool)`

GetDescription1Ok returns a tuple with the Description1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription1

`func (o *CoreSearchGetResults200ResponseResultsInner) SetDescription1(v string)`

SetDescription1 sets Description1 field to given value.

### HasDescription1

`func (o *CoreSearchGetResults200ResponseResultsInner) HasDescription1() bool`

HasDescription1 returns a boolean if a field has been set.

### GetDescription2

`func (o *CoreSearchGetResults200ResponseResultsInner) GetDescription2() string`

GetDescription2 returns the Description2 field if non-nil, zero value otherwise.

### GetDescription2Ok

`func (o *CoreSearchGetResults200ResponseResultsInner) GetDescription2Ok() (*string, bool)`

GetDescription2Ok returns a tuple with the Description2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription2

`func (o *CoreSearchGetResults200ResponseResultsInner) SetDescription2(v string)`

SetDescription2 sets Description2 field to given value.

### HasDescription2

`func (o *CoreSearchGetResults200ResponseResultsInner) HasDescription2() bool`

HasDescription2 returns a boolean if a field has been set.

### GetDocurl

`func (o *CoreSearchGetResults200ResponseResultsInner) GetDocurl() string`

GetDocurl returns the Docurl field if non-nil, zero value otherwise.

### GetDocurlOk

`func (o *CoreSearchGetResults200ResponseResultsInner) GetDocurlOk() (*string, bool)`

GetDocurlOk returns a tuple with the Docurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDocurl

`func (o *CoreSearchGetResults200ResponseResultsInner) SetDocurl(v string)`

SetDocurl sets Docurl field to given value.

### HasDocurl

`func (o *CoreSearchGetResults200ResponseResultsInner) HasDocurl() bool`

HasDocurl returns a boolean if a field has been set.

### GetFilename

`func (o *CoreSearchGetResults200ResponseResultsInner) GetFilename() string`

GetFilename returns the Filename field if non-nil, zero value otherwise.

### GetFilenameOk

`func (o *CoreSearchGetResults200ResponseResultsInner) GetFilenameOk() (*string, bool)`

GetFilenameOk returns a tuple with the Filename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilename

`func (o *CoreSearchGetResults200ResponseResultsInner) SetFilename(v string)`

SetFilename sets Filename field to given value.

### HasFilename

`func (o *CoreSearchGetResults200ResponseResultsInner) HasFilename() bool`

HasFilename returns a boolean if a field has been set.

### GetFilenames

`func (o *CoreSearchGetResults200ResponseResultsInner) GetFilenames() string`

GetFilenames returns the Filenames field if non-nil, zero value otherwise.

### GetFilenamesOk

`func (o *CoreSearchGetResults200ResponseResultsInner) GetFilenamesOk() (*string, bool)`

GetFilenamesOk returns a tuple with the Filenames field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilenames

`func (o *CoreSearchGetResults200ResponseResultsInner) SetFilenames(v string)`

SetFilenames sets Filenames field to given value.

### HasFilenames

`func (o *CoreSearchGetResults200ResponseResultsInner) HasFilenames() bool`

HasFilenames returns a boolean if a field has been set.

### GetIconurl

`func (o *CoreSearchGetResults200ResponseResultsInner) GetIconurl() string`

GetIconurl returns the Iconurl field if non-nil, zero value otherwise.

### GetIconurlOk

`func (o *CoreSearchGetResults200ResponseResultsInner) GetIconurlOk() (*string, bool)`

GetIconurlOk returns a tuple with the Iconurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIconurl

`func (o *CoreSearchGetResults200ResponseResultsInner) SetIconurl(v string)`

SetIconurl sets Iconurl field to given value.

### HasIconurl

`func (o *CoreSearchGetResults200ResponseResultsInner) HasIconurl() bool`

HasIconurl returns a boolean if a field has been set.

### GetItemid

`func (o *CoreSearchGetResults200ResponseResultsInner) GetItemid() int32`

GetItemid returns the Itemid field if non-nil, zero value otherwise.

### GetItemidOk

`func (o *CoreSearchGetResults200ResponseResultsInner) GetItemidOk() (*int32, bool)`

GetItemidOk returns a tuple with the Itemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemid

`func (o *CoreSearchGetResults200ResponseResultsInner) SetItemid(v int32)`

SetItemid sets Itemid field to given value.

### HasItemid

`func (o *CoreSearchGetResults200ResponseResultsInner) HasItemid() bool`

HasItemid returns a boolean if a field has been set.

### GetMultiplefiles

`func (o *CoreSearchGetResults200ResponseResultsInner) GetMultiplefiles() int32`

GetMultiplefiles returns the Multiplefiles field if non-nil, zero value otherwise.

### GetMultiplefilesOk

`func (o *CoreSearchGetResults200ResponseResultsInner) GetMultiplefilesOk() (*int32, bool)`

GetMultiplefilesOk returns a tuple with the Multiplefiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMultiplefiles

`func (o *CoreSearchGetResults200ResponseResultsInner) SetMultiplefiles(v int32)`

SetMultiplefiles sets Multiplefiles field to given value.

### HasMultiplefiles

`func (o *CoreSearchGetResults200ResponseResultsInner) HasMultiplefiles() bool`

HasMultiplefiles returns a boolean if a field has been set.

### GetTextformat

`func (o *CoreSearchGetResults200ResponseResultsInner) GetTextformat() int32`

GetTextformat returns the Textformat field if non-nil, zero value otherwise.

### GetTextformatOk

`func (o *CoreSearchGetResults200ResponseResultsInner) GetTextformatOk() (*int32, bool)`

GetTextformatOk returns a tuple with the Textformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTextformat

`func (o *CoreSearchGetResults200ResponseResultsInner) SetTextformat(v int32)`

SetTextformat sets Textformat field to given value.

### HasTextformat

`func (o *CoreSearchGetResults200ResponseResultsInner) HasTextformat() bool`

HasTextformat returns a boolean if a field has been set.

### GetTimemodified

`func (o *CoreSearchGetResults200ResponseResultsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreSearchGetResults200ResponseResultsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreSearchGetResults200ResponseResultsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *CoreSearchGetResults200ResponseResultsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetTitle

`func (o *CoreSearchGetResults200ResponseResultsInner) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *CoreSearchGetResults200ResponseResultsInner) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *CoreSearchGetResults200ResponseResultsInner) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *CoreSearchGetResults200ResponseResultsInner) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### GetUserfullname

`func (o *CoreSearchGetResults200ResponseResultsInner) GetUserfullname() string`

GetUserfullname returns the Userfullname field if non-nil, zero value otherwise.

### GetUserfullnameOk

`func (o *CoreSearchGetResults200ResponseResultsInner) GetUserfullnameOk() (*string, bool)`

GetUserfullnameOk returns a tuple with the Userfullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserfullname

`func (o *CoreSearchGetResults200ResponseResultsInner) SetUserfullname(v string)`

SetUserfullname sets Userfullname field to given value.

### HasUserfullname

`func (o *CoreSearchGetResults200ResponseResultsInner) HasUserfullname() bool`

HasUserfullname returns a boolean if a field has been set.

### GetUserid

`func (o *CoreSearchGetResults200ResponseResultsInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreSearchGetResults200ResponseResultsInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreSearchGetResults200ResponseResultsInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreSearchGetResults200ResponseResultsInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetUserurl

`func (o *CoreSearchGetResults200ResponseResultsInner) GetUserurl() string`

GetUserurl returns the Userurl field if non-nil, zero value otherwise.

### GetUserurlOk

`func (o *CoreSearchGetResults200ResponseResultsInner) GetUserurlOk() (*string, bool)`

GetUserurlOk returns a tuple with the Userurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserurl

`func (o *CoreSearchGetResults200ResponseResultsInner) SetUserurl(v string)`

SetUserurl sets Userurl field to given value.

### HasUserurl

`func (o *CoreSearchGetResults200ResponseResultsInner) HasUserurl() bool`

HasUserurl returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


