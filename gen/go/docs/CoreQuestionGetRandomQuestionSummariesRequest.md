# CoreQuestionGetRandomQuestionSummariesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categoryid** | **int32** | Category id to find random questions | [default to null]
**Contextid** | **int32** | Context id that the questions will be rendered in (used for exporting) | [default to null]
**Includesubcategories** | **bool** | Include the subcategories in the search | [default to null]
**Limit** | Pointer to **int32** | Maximum number of results to return | [optional] [default to 0]
**Offset** | Pointer to **int32** | Number of items to skip from the begging of the result set | [optional] [default to 0]
**Tagids** | **[]map[string]interface{}** |  | 

## Methods

### NewCoreQuestionGetRandomQuestionSummariesRequest

`func NewCoreQuestionGetRandomQuestionSummariesRequest(categoryid int32, contextid int32, includesubcategories bool, tagids []map[string]interface{}, ) *CoreQuestionGetRandomQuestionSummariesRequest`

NewCoreQuestionGetRandomQuestionSummariesRequest instantiates a new CoreQuestionGetRandomQuestionSummariesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreQuestionGetRandomQuestionSummariesRequestWithDefaults

`func NewCoreQuestionGetRandomQuestionSummariesRequestWithDefaults() *CoreQuestionGetRandomQuestionSummariesRequest`

NewCoreQuestionGetRandomQuestionSummariesRequestWithDefaults instantiates a new CoreQuestionGetRandomQuestionSummariesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategoryid

`func (o *CoreQuestionGetRandomQuestionSummariesRequest) GetCategoryid() int32`

GetCategoryid returns the Categoryid field if non-nil, zero value otherwise.

### GetCategoryidOk

`func (o *CoreQuestionGetRandomQuestionSummariesRequest) GetCategoryidOk() (*int32, bool)`

GetCategoryidOk returns a tuple with the Categoryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryid

`func (o *CoreQuestionGetRandomQuestionSummariesRequest) SetCategoryid(v int32)`

SetCategoryid sets Categoryid field to given value.


### GetContextid

`func (o *CoreQuestionGetRandomQuestionSummariesRequest) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreQuestionGetRandomQuestionSummariesRequest) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreQuestionGetRandomQuestionSummariesRequest) SetContextid(v int32)`

SetContextid sets Contextid field to given value.


### GetIncludesubcategories

`func (o *CoreQuestionGetRandomQuestionSummariesRequest) GetIncludesubcategories() bool`

GetIncludesubcategories returns the Includesubcategories field if non-nil, zero value otherwise.

### GetIncludesubcategoriesOk

`func (o *CoreQuestionGetRandomQuestionSummariesRequest) GetIncludesubcategoriesOk() (*bool, bool)`

GetIncludesubcategoriesOk returns a tuple with the Includesubcategories field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludesubcategories

`func (o *CoreQuestionGetRandomQuestionSummariesRequest) SetIncludesubcategories(v bool)`

SetIncludesubcategories sets Includesubcategories field to given value.


### GetLimit

`func (o *CoreQuestionGetRandomQuestionSummariesRequest) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *CoreQuestionGetRandomQuestionSummariesRequest) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *CoreQuestionGetRandomQuestionSummariesRequest) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *CoreQuestionGetRandomQuestionSummariesRequest) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetOffset

`func (o *CoreQuestionGetRandomQuestionSummariesRequest) GetOffset() int32`

GetOffset returns the Offset field if non-nil, zero value otherwise.

### GetOffsetOk

`func (o *CoreQuestionGetRandomQuestionSummariesRequest) GetOffsetOk() (*int32, bool)`

GetOffsetOk returns a tuple with the Offset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffset

`func (o *CoreQuestionGetRandomQuestionSummariesRequest) SetOffset(v int32)`

SetOffset sets Offset field to given value.

### HasOffset

`func (o *CoreQuestionGetRandomQuestionSummariesRequest) HasOffset() bool`

HasOffset returns a boolean if a field has been set.

### GetTagids

`func (o *CoreQuestionGetRandomQuestionSummariesRequest) GetTagids() []map[string]interface{}`

GetTagids returns the Tagids field if non-nil, zero value otherwise.

### GetTagidsOk

`func (o *CoreQuestionGetRandomQuestionSummariesRequest) GetTagidsOk() (*[]map[string]interface{}, bool)`

GetTagidsOk returns a tuple with the Tagids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTagids

`func (o *CoreQuestionGetRandomQuestionSummariesRequest) SetTagids(v []map[string]interface{})`

SetTagids sets Tagids field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


