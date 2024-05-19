# ModLessonGetUserAttempt200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Answerpages** | [**[]ModLessonGetUserAttempt200ResponseAnswerpagesInner**](ModLessonGetUserAttempt200ResponseAnswerpagesInner.md) |  | 
**Userstats** | [**ModLessonGetUserAttempt200ResponseUserstats**](ModLessonGetUserAttempt200ResponseUserstats.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModLessonGetUserAttempt200Response

`func NewModLessonGetUserAttempt200Response(answerpages []ModLessonGetUserAttempt200ResponseAnswerpagesInner, userstats ModLessonGetUserAttempt200ResponseUserstats, ) *ModLessonGetUserAttempt200Response`

NewModLessonGetUserAttempt200Response instantiates a new ModLessonGetUserAttempt200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetUserAttempt200ResponseWithDefaults

`func NewModLessonGetUserAttempt200ResponseWithDefaults() *ModLessonGetUserAttempt200Response`

NewModLessonGetUserAttempt200ResponseWithDefaults instantiates a new ModLessonGetUserAttempt200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAnswerpages

`func (o *ModLessonGetUserAttempt200Response) GetAnswerpages() []ModLessonGetUserAttempt200ResponseAnswerpagesInner`

GetAnswerpages returns the Answerpages field if non-nil, zero value otherwise.

### GetAnswerpagesOk

`func (o *ModLessonGetUserAttempt200Response) GetAnswerpagesOk() (*[]ModLessonGetUserAttempt200ResponseAnswerpagesInner, bool)`

GetAnswerpagesOk returns a tuple with the Answerpages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAnswerpages

`func (o *ModLessonGetUserAttempt200Response) SetAnswerpages(v []ModLessonGetUserAttempt200ResponseAnswerpagesInner)`

SetAnswerpages sets Answerpages field to given value.


### GetUserstats

`func (o *ModLessonGetUserAttempt200Response) GetUserstats() ModLessonGetUserAttempt200ResponseUserstats`

GetUserstats returns the Userstats field if non-nil, zero value otherwise.

### GetUserstatsOk

`func (o *ModLessonGetUserAttempt200Response) GetUserstatsOk() (*ModLessonGetUserAttempt200ResponseUserstats, bool)`

GetUserstatsOk returns a tuple with the Userstats field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserstats

`func (o *ModLessonGetUserAttempt200Response) SetUserstats(v ModLessonGetUserAttempt200ResponseUserstats)`

SetUserstats sets Userstats field to given value.


### GetWarnings

`func (o *ModLessonGetUserAttempt200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModLessonGetUserAttempt200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModLessonGetUserAttempt200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModLessonGetUserAttempt200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


