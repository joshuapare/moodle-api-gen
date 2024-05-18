# ModLessonGetPageData200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Answers** | [**[]ModLessonGetPageData200ResponseAnswersInner**](ModLessonGetPageData200ResponseAnswersInner.md) |  | 
**Contentfiles** | [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | 
**Displaymenu** | **bool** | Whether we should display the menu or not in this page. | [default to null]
**Messages** | [**[]ModLessonGetPageData200ResponseMessagesInner**](ModLessonGetPageData200ResponseMessagesInner.md) |  | 
**Newpageid** | **int32** | New page id (if a jump was made) | [default to null]
**Ongoingscore** | **string** | The ongoing score message | [default to "null"]
**Page** | Pointer to [**ModLessonGetPageData200ResponsePage**](ModLessonGetPageData200ResponsePage.md) |  | [optional] 
**Pagecontent** | Pointer to **string** | Page html content | [optional] [default to "null"]
**Progress** | **int32** | Progress percentage in the lesson | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModLessonGetPageData200Response

`func NewModLessonGetPageData200Response(answers []ModLessonGetPageData200ResponseAnswersInner, contentfiles []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, displaymenu bool, messages []ModLessonGetPageData200ResponseMessagesInner, newpageid int32, ongoingscore string, progress int32, ) *ModLessonGetPageData200Response`

NewModLessonGetPageData200Response instantiates a new ModLessonGetPageData200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetPageData200ResponseWithDefaults

`func NewModLessonGetPageData200ResponseWithDefaults() *ModLessonGetPageData200Response`

NewModLessonGetPageData200ResponseWithDefaults instantiates a new ModLessonGetPageData200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAnswers

`func (o *ModLessonGetPageData200Response) GetAnswers() []ModLessonGetPageData200ResponseAnswersInner`

GetAnswers returns the Answers field if non-nil, zero value otherwise.

### GetAnswersOk

`func (o *ModLessonGetPageData200Response) GetAnswersOk() (*[]ModLessonGetPageData200ResponseAnswersInner, bool)`

GetAnswersOk returns a tuple with the Answers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAnswers

`func (o *ModLessonGetPageData200Response) SetAnswers(v []ModLessonGetPageData200ResponseAnswersInner)`

SetAnswers sets Answers field to given value.


### GetContentfiles

`func (o *ModLessonGetPageData200Response) GetContentfiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetContentfiles returns the Contentfiles field if non-nil, zero value otherwise.

### GetContentfilesOk

`func (o *ModLessonGetPageData200Response) GetContentfilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetContentfilesOk returns a tuple with the Contentfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentfiles

`func (o *ModLessonGetPageData200Response) SetContentfiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetContentfiles sets Contentfiles field to given value.


### GetDisplaymenu

`func (o *ModLessonGetPageData200Response) GetDisplaymenu() bool`

GetDisplaymenu returns the Displaymenu field if non-nil, zero value otherwise.

### GetDisplaymenuOk

`func (o *ModLessonGetPageData200Response) GetDisplaymenuOk() (*bool, bool)`

GetDisplaymenuOk returns a tuple with the Displaymenu field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplaymenu

`func (o *ModLessonGetPageData200Response) SetDisplaymenu(v bool)`

SetDisplaymenu sets Displaymenu field to given value.


### GetMessages

`func (o *ModLessonGetPageData200Response) GetMessages() []ModLessonGetPageData200ResponseMessagesInner`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *ModLessonGetPageData200Response) GetMessagesOk() (*[]ModLessonGetPageData200ResponseMessagesInner, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *ModLessonGetPageData200Response) SetMessages(v []ModLessonGetPageData200ResponseMessagesInner)`

SetMessages sets Messages field to given value.


### GetNewpageid

`func (o *ModLessonGetPageData200Response) GetNewpageid() int32`

GetNewpageid returns the Newpageid field if non-nil, zero value otherwise.

### GetNewpageidOk

`func (o *ModLessonGetPageData200Response) GetNewpageidOk() (*int32, bool)`

GetNewpageidOk returns a tuple with the Newpageid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewpageid

`func (o *ModLessonGetPageData200Response) SetNewpageid(v int32)`

SetNewpageid sets Newpageid field to given value.


### GetOngoingscore

`func (o *ModLessonGetPageData200Response) GetOngoingscore() string`

GetOngoingscore returns the Ongoingscore field if non-nil, zero value otherwise.

### GetOngoingscoreOk

`func (o *ModLessonGetPageData200Response) GetOngoingscoreOk() (*string, bool)`

GetOngoingscoreOk returns a tuple with the Ongoingscore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOngoingscore

`func (o *ModLessonGetPageData200Response) SetOngoingscore(v string)`

SetOngoingscore sets Ongoingscore field to given value.


### GetPage

`func (o *ModLessonGetPageData200Response) GetPage() ModLessonGetPageData200ResponsePage`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *ModLessonGetPageData200Response) GetPageOk() (*ModLessonGetPageData200ResponsePage, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *ModLessonGetPageData200Response) SetPage(v ModLessonGetPageData200ResponsePage)`

SetPage sets Page field to given value.

### HasPage

`func (o *ModLessonGetPageData200Response) HasPage() bool`

HasPage returns a boolean if a field has been set.

### GetPagecontent

`func (o *ModLessonGetPageData200Response) GetPagecontent() string`

GetPagecontent returns the Pagecontent field if non-nil, zero value otherwise.

### GetPagecontentOk

`func (o *ModLessonGetPageData200Response) GetPagecontentOk() (*string, bool)`

GetPagecontentOk returns a tuple with the Pagecontent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPagecontent

`func (o *ModLessonGetPageData200Response) SetPagecontent(v string)`

SetPagecontent sets Pagecontent field to given value.

### HasPagecontent

`func (o *ModLessonGetPageData200Response) HasPagecontent() bool`

HasPagecontent returns a boolean if a field has been set.

### GetProgress

`func (o *ModLessonGetPageData200Response) GetProgress() int32`

GetProgress returns the Progress field if non-nil, zero value otherwise.

### GetProgressOk

`func (o *ModLessonGetPageData200Response) GetProgressOk() (*int32, bool)`

GetProgressOk returns a tuple with the Progress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProgress

`func (o *ModLessonGetPageData200Response) SetProgress(v int32)`

SetProgress sets Progress field to given value.


### GetWarnings

`func (o *ModLessonGetPageData200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModLessonGetPageData200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModLessonGetPageData200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModLessonGetPageData200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


