# ToolDataprivacyGetDataRequest200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | [**ToolDataprivacyGetDataRequest200ResponseResult**](ToolDataprivacyGetDataRequest200ResponseResult.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewToolDataprivacyGetDataRequest200Response

`func NewToolDataprivacyGetDataRequest200Response(result ToolDataprivacyGetDataRequest200ResponseResult, ) *ToolDataprivacyGetDataRequest200Response`

NewToolDataprivacyGetDataRequest200Response instantiates a new ToolDataprivacyGetDataRequest200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolDataprivacyGetDataRequest200ResponseWithDefaults

`func NewToolDataprivacyGetDataRequest200ResponseWithDefaults() *ToolDataprivacyGetDataRequest200Response`

NewToolDataprivacyGetDataRequest200ResponseWithDefaults instantiates a new ToolDataprivacyGetDataRequest200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResult

`func (o *ToolDataprivacyGetDataRequest200Response) GetResult() ToolDataprivacyGetDataRequest200ResponseResult`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *ToolDataprivacyGetDataRequest200Response) GetResultOk() (*ToolDataprivacyGetDataRequest200ResponseResult, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *ToolDataprivacyGetDataRequest200Response) SetResult(v ToolDataprivacyGetDataRequest200ResponseResult)`

SetResult sets Result field to given value.


### GetWarnings

`func (o *ToolDataprivacyGetDataRequest200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ToolDataprivacyGetDataRequest200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ToolDataprivacyGetDataRequest200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ToolDataprivacyGetDataRequest200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


