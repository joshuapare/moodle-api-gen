# ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Answers** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Response** | **string** | The response text. | [default to "null"]
**Responseformat** | **int32** | response. format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [default to null]
**Score** | **string** | The score (text version). | [default to "null"]

## Methods

### NewModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata

`func NewModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata(response string, responseformat int32, score string, ) *ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata`

NewModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata instantiates a new ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdataWithDefaults

`func NewModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdataWithDefaults() *ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata`

NewModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdataWithDefaults instantiates a new ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAnswers

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata) GetAnswers() []map[string]interface{}`

GetAnswers returns the Answers field if non-nil, zero value otherwise.

### GetAnswersOk

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata) GetAnswersOk() (*[]map[string]interface{}, bool)`

GetAnswersOk returns a tuple with the Answers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAnswers

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata) SetAnswers(v []map[string]interface{})`

SetAnswers sets Answers field to given value.

### HasAnswers

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata) HasAnswers() bool`

HasAnswers returns a boolean if a field has been set.

### GetResponse

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata) GetResponse() string`

GetResponse returns the Response field if non-nil, zero value otherwise.

### GetResponseOk

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata) GetResponseOk() (*string, bool)`

GetResponseOk returns a tuple with the Response field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponse

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata) SetResponse(v string)`

SetResponse sets Response field to given value.


### GetResponseformat

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata) GetResponseformat() int32`

GetResponseformat returns the Responseformat field if non-nil, zero value otherwise.

### GetResponseformatOk

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata) GetResponseformatOk() (*int32, bool)`

GetResponseformatOk returns a tuple with the Responseformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseformat

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata) SetResponseformat(v int32)`

SetResponseformat sets Responseformat field to given value.


### GetScore

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata) GetScore() string`

GetScore returns the Score field if non-nil, zero value otherwise.

### GetScoreOk

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata) GetScoreOk() (*string, bool)`

GetScoreOk returns a tuple with the Score field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScore

`func (o *ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata) SetScore(v string)`

SetScore sets Score field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


