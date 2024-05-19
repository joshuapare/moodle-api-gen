# ModLessonGetPageData200ResponseAnswersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Answer** | Pointer to **string** | Possible answer text | [optional] [default to "null"]
**Answerfiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Answerformat** | Pointer to **int32** | answer format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**Flags** | Pointer to **int32** | Used to store options for the answer | [optional] [default to null]
**Grade** | Pointer to **int32** | The grade this answer is worth | [optional] [default to null]
**Id** | Pointer to **int32** | The ID of this answer in the database | [optional] [default to null]
**Jumpto** | Pointer to **int32** | Identifies where the user goes upon completing a page with this answer | [optional] [default to null]
**Response** | Pointer to **string** | Response text for the answer | [optional] [default to "null"]
**Responsefiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Responseformat** | Pointer to **int32** | response format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**Score** | Pointer to **int32** | The score this answer will give | [optional] [default to null]
**Timecreated** | Pointer to **int32** | A timestamp of when the answer was created | [optional] [default to null]
**Timemodified** | Pointer to **int32** | A timestamp of when the answer was modified | [optional] [default to null]

## Methods

### NewModLessonGetPageData200ResponseAnswersInner

`func NewModLessonGetPageData200ResponseAnswersInner() *ModLessonGetPageData200ResponseAnswersInner`

NewModLessonGetPageData200ResponseAnswersInner instantiates a new ModLessonGetPageData200ResponseAnswersInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetPageData200ResponseAnswersInnerWithDefaults

`func NewModLessonGetPageData200ResponseAnswersInnerWithDefaults() *ModLessonGetPageData200ResponseAnswersInner`

NewModLessonGetPageData200ResponseAnswersInnerWithDefaults instantiates a new ModLessonGetPageData200ResponseAnswersInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAnswer

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetAnswer() string`

GetAnswer returns the Answer field if non-nil, zero value otherwise.

### GetAnswerOk

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetAnswerOk() (*string, bool)`

GetAnswerOk returns a tuple with the Answer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAnswer

`func (o *ModLessonGetPageData200ResponseAnswersInner) SetAnswer(v string)`

SetAnswer sets Answer field to given value.

### HasAnswer

`func (o *ModLessonGetPageData200ResponseAnswersInner) HasAnswer() bool`

HasAnswer returns a boolean if a field has been set.

### GetAnswerfiles

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetAnswerfiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetAnswerfiles returns the Answerfiles field if non-nil, zero value otherwise.

### GetAnswerfilesOk

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetAnswerfilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetAnswerfilesOk returns a tuple with the Answerfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAnswerfiles

`func (o *ModLessonGetPageData200ResponseAnswersInner) SetAnswerfiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetAnswerfiles sets Answerfiles field to given value.

### HasAnswerfiles

`func (o *ModLessonGetPageData200ResponseAnswersInner) HasAnswerfiles() bool`

HasAnswerfiles returns a boolean if a field has been set.

### GetAnswerformat

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetAnswerformat() int32`

GetAnswerformat returns the Answerformat field if non-nil, zero value otherwise.

### GetAnswerformatOk

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetAnswerformatOk() (*int32, bool)`

GetAnswerformatOk returns a tuple with the Answerformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAnswerformat

`func (o *ModLessonGetPageData200ResponseAnswersInner) SetAnswerformat(v int32)`

SetAnswerformat sets Answerformat field to given value.

### HasAnswerformat

`func (o *ModLessonGetPageData200ResponseAnswersInner) HasAnswerformat() bool`

HasAnswerformat returns a boolean if a field has been set.

### GetFlags

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetFlags() int32`

GetFlags returns the Flags field if non-nil, zero value otherwise.

### GetFlagsOk

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetFlagsOk() (*int32, bool)`

GetFlagsOk returns a tuple with the Flags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlags

`func (o *ModLessonGetPageData200ResponseAnswersInner) SetFlags(v int32)`

SetFlags sets Flags field to given value.

### HasFlags

`func (o *ModLessonGetPageData200ResponseAnswersInner) HasFlags() bool`

HasFlags returns a boolean if a field has been set.

### GetGrade

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetGrade() int32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetGradeOk() (*int32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *ModLessonGetPageData200ResponseAnswersInner) SetGrade(v int32)`

SetGrade sets Grade field to given value.

### HasGrade

`func (o *ModLessonGetPageData200ResponseAnswersInner) HasGrade() bool`

HasGrade returns a boolean if a field has been set.

### GetId

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModLessonGetPageData200ResponseAnswersInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModLessonGetPageData200ResponseAnswersInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetJumpto

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetJumpto() int32`

GetJumpto returns the Jumpto field if non-nil, zero value otherwise.

### GetJumptoOk

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetJumptoOk() (*int32, bool)`

GetJumptoOk returns a tuple with the Jumpto field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJumpto

`func (o *ModLessonGetPageData200ResponseAnswersInner) SetJumpto(v int32)`

SetJumpto sets Jumpto field to given value.

### HasJumpto

`func (o *ModLessonGetPageData200ResponseAnswersInner) HasJumpto() bool`

HasJumpto returns a boolean if a field has been set.

### GetResponse

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetResponse() string`

GetResponse returns the Response field if non-nil, zero value otherwise.

### GetResponseOk

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetResponseOk() (*string, bool)`

GetResponseOk returns a tuple with the Response field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponse

`func (o *ModLessonGetPageData200ResponseAnswersInner) SetResponse(v string)`

SetResponse sets Response field to given value.

### HasResponse

`func (o *ModLessonGetPageData200ResponseAnswersInner) HasResponse() bool`

HasResponse returns a boolean if a field has been set.

### GetResponsefiles

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetResponsefiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetResponsefiles returns the Responsefiles field if non-nil, zero value otherwise.

### GetResponsefilesOk

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetResponsefilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetResponsefilesOk returns a tuple with the Responsefiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponsefiles

`func (o *ModLessonGetPageData200ResponseAnswersInner) SetResponsefiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetResponsefiles sets Responsefiles field to given value.

### HasResponsefiles

`func (o *ModLessonGetPageData200ResponseAnswersInner) HasResponsefiles() bool`

HasResponsefiles returns a boolean if a field has been set.

### GetResponseformat

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetResponseformat() int32`

GetResponseformat returns the Responseformat field if non-nil, zero value otherwise.

### GetResponseformatOk

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetResponseformatOk() (*int32, bool)`

GetResponseformatOk returns a tuple with the Responseformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseformat

`func (o *ModLessonGetPageData200ResponseAnswersInner) SetResponseformat(v int32)`

SetResponseformat sets Responseformat field to given value.

### HasResponseformat

`func (o *ModLessonGetPageData200ResponseAnswersInner) HasResponseformat() bool`

HasResponseformat returns a boolean if a field has been set.

### GetScore

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetScore() int32`

GetScore returns the Score field if non-nil, zero value otherwise.

### GetScoreOk

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetScoreOk() (*int32, bool)`

GetScoreOk returns a tuple with the Score field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScore

`func (o *ModLessonGetPageData200ResponseAnswersInner) SetScore(v int32)`

SetScore sets Score field to given value.

### HasScore

`func (o *ModLessonGetPageData200ResponseAnswersInner) HasScore() bool`

HasScore returns a boolean if a field has been set.

### GetTimecreated

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModLessonGetPageData200ResponseAnswersInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *ModLessonGetPageData200ResponseAnswersInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModLessonGetPageData200ResponseAnswersInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModLessonGetPageData200ResponseAnswersInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModLessonGetPageData200ResponseAnswersInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


