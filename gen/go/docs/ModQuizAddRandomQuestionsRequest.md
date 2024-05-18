# ModQuizAddRandomQuestionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Addonpage** | **int32** | The page where random questions will be added to | [default to null]
**Cmid** | **int32** | The cmid of the quiz | [default to null]
**Filtercondition** | Pointer to **string** | (Optional) The filter condition used when adding random questions from an existing category.                     Not required if adding random questions from a new category. | [optional] [default to ""]
**Newcategory** | Pointer to **string** | (Optional) The name of a new question category to create and use for the random questions. | [optional] [default to ""]
**Parentcategory** | Pointer to **string** | (Optional) The parent of the new question category, if creating one. | [optional] [default to "0"]
**Randomcount** | **int32** | Number of random questions | [default to null]

## Methods

### NewModQuizAddRandomQuestionsRequest

`func NewModQuizAddRandomQuestionsRequest(addonpage int32, cmid int32, randomcount int32, ) *ModQuizAddRandomQuestionsRequest`

NewModQuizAddRandomQuestionsRequest instantiates a new ModQuizAddRandomQuestionsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizAddRandomQuestionsRequestWithDefaults

`func NewModQuizAddRandomQuestionsRequestWithDefaults() *ModQuizAddRandomQuestionsRequest`

NewModQuizAddRandomQuestionsRequestWithDefaults instantiates a new ModQuizAddRandomQuestionsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAddonpage

`func (o *ModQuizAddRandomQuestionsRequest) GetAddonpage() int32`

GetAddonpage returns the Addonpage field if non-nil, zero value otherwise.

### GetAddonpageOk

`func (o *ModQuizAddRandomQuestionsRequest) GetAddonpageOk() (*int32, bool)`

GetAddonpageOk returns a tuple with the Addonpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddonpage

`func (o *ModQuizAddRandomQuestionsRequest) SetAddonpage(v int32)`

SetAddonpage sets Addonpage field to given value.


### GetCmid

`func (o *ModQuizAddRandomQuestionsRequest) GetCmid() int32`

GetCmid returns the Cmid field if non-nil, zero value otherwise.

### GetCmidOk

`func (o *ModQuizAddRandomQuestionsRequest) GetCmidOk() (*int32, bool)`

GetCmidOk returns a tuple with the Cmid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCmid

`func (o *ModQuizAddRandomQuestionsRequest) SetCmid(v int32)`

SetCmid sets Cmid field to given value.


### GetFiltercondition

`func (o *ModQuizAddRandomQuestionsRequest) GetFiltercondition() string`

GetFiltercondition returns the Filtercondition field if non-nil, zero value otherwise.

### GetFilterconditionOk

`func (o *ModQuizAddRandomQuestionsRequest) GetFilterconditionOk() (*string, bool)`

GetFilterconditionOk returns a tuple with the Filtercondition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiltercondition

`func (o *ModQuizAddRandomQuestionsRequest) SetFiltercondition(v string)`

SetFiltercondition sets Filtercondition field to given value.

### HasFiltercondition

`func (o *ModQuizAddRandomQuestionsRequest) HasFiltercondition() bool`

HasFiltercondition returns a boolean if a field has been set.

### GetNewcategory

`func (o *ModQuizAddRandomQuestionsRequest) GetNewcategory() string`

GetNewcategory returns the Newcategory field if non-nil, zero value otherwise.

### GetNewcategoryOk

`func (o *ModQuizAddRandomQuestionsRequest) GetNewcategoryOk() (*string, bool)`

GetNewcategoryOk returns a tuple with the Newcategory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewcategory

`func (o *ModQuizAddRandomQuestionsRequest) SetNewcategory(v string)`

SetNewcategory sets Newcategory field to given value.

### HasNewcategory

`func (o *ModQuizAddRandomQuestionsRequest) HasNewcategory() bool`

HasNewcategory returns a boolean if a field has been set.

### GetParentcategory

`func (o *ModQuizAddRandomQuestionsRequest) GetParentcategory() string`

GetParentcategory returns the Parentcategory field if non-nil, zero value otherwise.

### GetParentcategoryOk

`func (o *ModQuizAddRandomQuestionsRequest) GetParentcategoryOk() (*string, bool)`

GetParentcategoryOk returns a tuple with the Parentcategory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentcategory

`func (o *ModQuizAddRandomQuestionsRequest) SetParentcategory(v string)`

SetParentcategory sets Parentcategory field to given value.

### HasParentcategory

`func (o *ModQuizAddRandomQuestionsRequest) HasParentcategory() bool`

HasParentcategory returns a boolean if a field has been set.

### GetRandomcount

`func (o *ModQuizAddRandomQuestionsRequest) GetRandomcount() int32`

GetRandomcount returns the Randomcount field if non-nil, zero value otherwise.

### GetRandomcountOk

`func (o *ModQuizAddRandomQuestionsRequest) GetRandomcountOk() (*int32, bool)`

GetRandomcountOk returns a tuple with the Randomcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRandomcount

`func (o *ModQuizAddRandomQuestionsRequest) SetRandomcount(v int32)`

SetRandomcount sets Randomcount field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


