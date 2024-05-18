# ModLessonGetAttemptsOverview200ResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Avescore** | **float32** | Average score. | [default to null]
**Avetime** | **int32** | Average time (spent in taking the lesson). | [default to null]
**Highscore** | **float32** | High score. | [default to null]
**Hightime** | **int32** | High time. | [default to null]
**Lessonscored** | **bool** | True if the lesson was scored. | [default to null]
**Lowscore** | **float32** | Low score. | [default to null]
**Lowtime** | **int32** | Low time. | [default to null]
**Numofattempts** | **int32** | Number of attempts. | [default to null]
**Students** | Pointer to [**[]ModLessonGetAttemptsOverview200ResponseDataStudentsInner**](ModLessonGetAttemptsOverview200ResponseDataStudentsInner.md) |  | [optional] 

## Methods

### NewModLessonGetAttemptsOverview200ResponseData

`func NewModLessonGetAttemptsOverview200ResponseData(avescore float32, avetime int32, highscore float32, hightime int32, lessonscored bool, lowscore float32, lowtime int32, numofattempts int32, ) *ModLessonGetAttemptsOverview200ResponseData`

NewModLessonGetAttemptsOverview200ResponseData instantiates a new ModLessonGetAttemptsOverview200ResponseData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetAttemptsOverview200ResponseDataWithDefaults

`func NewModLessonGetAttemptsOverview200ResponseDataWithDefaults() *ModLessonGetAttemptsOverview200ResponseData`

NewModLessonGetAttemptsOverview200ResponseDataWithDefaults instantiates a new ModLessonGetAttemptsOverview200ResponseData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAvescore

`func (o *ModLessonGetAttemptsOverview200ResponseData) GetAvescore() float32`

GetAvescore returns the Avescore field if non-nil, zero value otherwise.

### GetAvescoreOk

`func (o *ModLessonGetAttemptsOverview200ResponseData) GetAvescoreOk() (*float32, bool)`

GetAvescoreOk returns a tuple with the Avescore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvescore

`func (o *ModLessonGetAttemptsOverview200ResponseData) SetAvescore(v float32)`

SetAvescore sets Avescore field to given value.


### GetAvetime

`func (o *ModLessonGetAttemptsOverview200ResponseData) GetAvetime() int32`

GetAvetime returns the Avetime field if non-nil, zero value otherwise.

### GetAvetimeOk

`func (o *ModLessonGetAttemptsOverview200ResponseData) GetAvetimeOk() (*int32, bool)`

GetAvetimeOk returns a tuple with the Avetime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvetime

`func (o *ModLessonGetAttemptsOverview200ResponseData) SetAvetime(v int32)`

SetAvetime sets Avetime field to given value.


### GetHighscore

`func (o *ModLessonGetAttemptsOverview200ResponseData) GetHighscore() float32`

GetHighscore returns the Highscore field if non-nil, zero value otherwise.

### GetHighscoreOk

`func (o *ModLessonGetAttemptsOverview200ResponseData) GetHighscoreOk() (*float32, bool)`

GetHighscoreOk returns a tuple with the Highscore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHighscore

`func (o *ModLessonGetAttemptsOverview200ResponseData) SetHighscore(v float32)`

SetHighscore sets Highscore field to given value.


### GetHightime

`func (o *ModLessonGetAttemptsOverview200ResponseData) GetHightime() int32`

GetHightime returns the Hightime field if non-nil, zero value otherwise.

### GetHightimeOk

`func (o *ModLessonGetAttemptsOverview200ResponseData) GetHightimeOk() (*int32, bool)`

GetHightimeOk returns a tuple with the Hightime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHightime

`func (o *ModLessonGetAttemptsOverview200ResponseData) SetHightime(v int32)`

SetHightime sets Hightime field to given value.


### GetLessonscored

`func (o *ModLessonGetAttemptsOverview200ResponseData) GetLessonscored() bool`

GetLessonscored returns the Lessonscored field if non-nil, zero value otherwise.

### GetLessonscoredOk

`func (o *ModLessonGetAttemptsOverview200ResponseData) GetLessonscoredOk() (*bool, bool)`

GetLessonscoredOk returns a tuple with the Lessonscored field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLessonscored

`func (o *ModLessonGetAttemptsOverview200ResponseData) SetLessonscored(v bool)`

SetLessonscored sets Lessonscored field to given value.


### GetLowscore

`func (o *ModLessonGetAttemptsOverview200ResponseData) GetLowscore() float32`

GetLowscore returns the Lowscore field if non-nil, zero value otherwise.

### GetLowscoreOk

`func (o *ModLessonGetAttemptsOverview200ResponseData) GetLowscoreOk() (*float32, bool)`

GetLowscoreOk returns a tuple with the Lowscore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLowscore

`func (o *ModLessonGetAttemptsOverview200ResponseData) SetLowscore(v float32)`

SetLowscore sets Lowscore field to given value.


### GetLowtime

`func (o *ModLessonGetAttemptsOverview200ResponseData) GetLowtime() int32`

GetLowtime returns the Lowtime field if non-nil, zero value otherwise.

### GetLowtimeOk

`func (o *ModLessonGetAttemptsOverview200ResponseData) GetLowtimeOk() (*int32, bool)`

GetLowtimeOk returns a tuple with the Lowtime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLowtime

`func (o *ModLessonGetAttemptsOverview200ResponseData) SetLowtime(v int32)`

SetLowtime sets Lowtime field to given value.


### GetNumofattempts

`func (o *ModLessonGetAttemptsOverview200ResponseData) GetNumofattempts() int32`

GetNumofattempts returns the Numofattempts field if non-nil, zero value otherwise.

### GetNumofattemptsOk

`func (o *ModLessonGetAttemptsOverview200ResponseData) GetNumofattemptsOk() (*int32, bool)`

GetNumofattemptsOk returns a tuple with the Numofattempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumofattempts

`func (o *ModLessonGetAttemptsOverview200ResponseData) SetNumofattempts(v int32)`

SetNumofattempts sets Numofattempts field to given value.


### GetStudents

`func (o *ModLessonGetAttemptsOverview200ResponseData) GetStudents() []ModLessonGetAttemptsOverview200ResponseDataStudentsInner`

GetStudents returns the Students field if non-nil, zero value otherwise.

### GetStudentsOk

`func (o *ModLessonGetAttemptsOverview200ResponseData) GetStudentsOk() (*[]ModLessonGetAttemptsOverview200ResponseDataStudentsInner, bool)`

GetStudentsOk returns a tuple with the Students field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStudents

`func (o *ModLessonGetAttemptsOverview200ResponseData) SetStudents(v []ModLessonGetAttemptsOverview200ResponseDataStudentsInner)`

SetStudents sets Students field to given value.

### HasStudents

`func (o *ModLessonGetAttemptsOverview200ResponseData) HasStudents() bool`

HasStudents returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


