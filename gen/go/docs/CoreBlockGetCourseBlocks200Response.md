# CoreBlockGetCourseBlocks200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Blocks** | [**[]CoreBlockGetCourseBlocks200ResponseBlocksInner**](CoreBlockGetCourseBlocks200ResponseBlocksInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreBlockGetCourseBlocks200Response

`func NewCoreBlockGetCourseBlocks200Response(blocks []CoreBlockGetCourseBlocks200ResponseBlocksInner, ) *CoreBlockGetCourseBlocks200Response`

NewCoreBlockGetCourseBlocks200Response instantiates a new CoreBlockGetCourseBlocks200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreBlockGetCourseBlocks200ResponseWithDefaults

`func NewCoreBlockGetCourseBlocks200ResponseWithDefaults() *CoreBlockGetCourseBlocks200Response`

NewCoreBlockGetCourseBlocks200ResponseWithDefaults instantiates a new CoreBlockGetCourseBlocks200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBlocks

`func (o *CoreBlockGetCourseBlocks200Response) GetBlocks() []CoreBlockGetCourseBlocks200ResponseBlocksInner`

GetBlocks returns the Blocks field if non-nil, zero value otherwise.

### GetBlocksOk

`func (o *CoreBlockGetCourseBlocks200Response) GetBlocksOk() (*[]CoreBlockGetCourseBlocks200ResponseBlocksInner, bool)`

GetBlocksOk returns a tuple with the Blocks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlocks

`func (o *CoreBlockGetCourseBlocks200Response) SetBlocks(v []CoreBlockGetCourseBlocks200ResponseBlocksInner)`

SetBlocks sets Blocks field to given value.


### GetWarnings

`func (o *CoreBlockGetCourseBlocks200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreBlockGetCourseBlocks200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreBlockGetCourseBlocks200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreBlockGetCourseBlocks200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


