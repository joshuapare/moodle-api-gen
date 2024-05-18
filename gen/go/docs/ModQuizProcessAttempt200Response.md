# ModQuizProcessAttempt200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**State** | **string** | state: the new attempt state:                                                                     inprogress, finished, overdue, abandoned | [default to "null"]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModQuizProcessAttempt200Response

`func NewModQuizProcessAttempt200Response(state string, ) *ModQuizProcessAttempt200Response`

NewModQuizProcessAttempt200Response instantiates a new ModQuizProcessAttempt200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizProcessAttempt200ResponseWithDefaults

`func NewModQuizProcessAttempt200ResponseWithDefaults() *ModQuizProcessAttempt200Response`

NewModQuizProcessAttempt200ResponseWithDefaults instantiates a new ModQuizProcessAttempt200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetState

`func (o *ModQuizProcessAttempt200Response) GetState() string`

GetState returns the State field if non-nil, zero value otherwise.

### GetStateOk

`func (o *ModQuizProcessAttempt200Response) GetStateOk() (*string, bool)`

GetStateOk returns a tuple with the State field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetState

`func (o *ModQuizProcessAttempt200Response) SetState(v string)`

SetState sets State field to given value.


### GetWarnings

`func (o *ModQuizProcessAttempt200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModQuizProcessAttempt200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModQuizProcessAttempt200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModQuizProcessAttempt200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


