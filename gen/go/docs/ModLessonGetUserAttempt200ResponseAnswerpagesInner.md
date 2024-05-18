# ModLessonGetUserAttempt200ResponseAnswerpagesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Answerdata** | Pointer to [**ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata**](ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata.md) |  | [optional] 
**Contents** | Pointer to **string** | Page contents. | [optional] [default to "null"]
**Grayout** | Pointer to **int32** | If is required to apply a grayout. | [optional] [default to null]
**Page** | Pointer to [**ModLessonGetPages200ResponsePagesInnerPage**](ModLessonGetPages200ResponsePagesInnerPage.md) |  | [optional] 
**Qtype** | Pointer to **string** | Identifies the page type of this page. | [optional] [default to "null"]
**Title** | Pointer to **string** | Page title. | [optional] [default to "null"]

## Methods

### NewModLessonGetUserAttempt200ResponseAnswerpagesInner

`func NewModLessonGetUserAttempt200ResponseAnswerpagesInner() *ModLessonGetUserAttempt200ResponseAnswerpagesInner`

NewModLessonGetUserAttempt200ResponseAnswerpagesInner instantiates a new ModLessonGetUserAttempt200ResponseAnswerpagesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetUserAttempt200ResponseAnswerpagesInnerWithDefaults

`func NewModLessonGetUserAttempt200ResponseAnswerpagesInnerWithDefaults() *ModLessonGetUserAttempt200ResponseAnswerpagesInner`

NewModLessonGetUserAttempt200ResponseAnswerpagesInnerWithDefaults instantiates a new ModLessonGetUserAttempt200ResponseAnswerpagesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAnswerdata

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInner) GetAnswerdata() ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata`

GetAnswerdata returns the Answerdata field if non-nil, zero value otherwise.

### GetAnswerdataOk

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInner) GetAnswerdataOk() (*ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata, bool)`

GetAnswerdataOk returns a tuple with the Answerdata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAnswerdata

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInner) SetAnswerdata(v ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata)`

SetAnswerdata sets Answerdata field to given value.

### HasAnswerdata

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInner) HasAnswerdata() bool`

HasAnswerdata returns a boolean if a field has been set.

### GetContents

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInner) GetContents() string`

GetContents returns the Contents field if non-nil, zero value otherwise.

### GetContentsOk

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInner) GetContentsOk() (*string, bool)`

GetContentsOk returns a tuple with the Contents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContents

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInner) SetContents(v string)`

SetContents sets Contents field to given value.

### HasContents

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInner) HasContents() bool`

HasContents returns a boolean if a field has been set.

### GetGrayout

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInner) GetGrayout() int32`

GetGrayout returns the Grayout field if non-nil, zero value otherwise.

### GetGrayoutOk

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInner) GetGrayoutOk() (*int32, bool)`

GetGrayoutOk returns a tuple with the Grayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrayout

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInner) SetGrayout(v int32)`

SetGrayout sets Grayout field to given value.

### HasGrayout

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInner) HasGrayout() bool`

HasGrayout returns a boolean if a field has been set.

### GetPage

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInner) GetPage() ModLessonGetPages200ResponsePagesInnerPage`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInner) GetPageOk() (*ModLessonGetPages200ResponsePagesInnerPage, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInner) SetPage(v ModLessonGetPages200ResponsePagesInnerPage)`

SetPage sets Page field to given value.

### HasPage

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInner) HasPage() bool`

HasPage returns a boolean if a field has been set.

### GetQtype

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInner) GetQtype() string`

GetQtype returns the Qtype field if non-nil, zero value otherwise.

### GetQtypeOk

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInner) GetQtypeOk() (*string, bool)`

GetQtypeOk returns a tuple with the Qtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQtype

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInner) SetQtype(v string)`

SetQtype sets Qtype field to given value.

### HasQtype

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInner) HasQtype() bool`

HasQtype returns a boolean if a field has been set.

### GetTitle

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInner) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInner) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInner) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInner) HasTitle() bool`

HasTitle returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


