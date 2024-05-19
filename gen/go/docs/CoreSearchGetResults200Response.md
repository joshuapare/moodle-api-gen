# CoreSearchGetResults200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Results** | [**[]CoreSearchGetResults200ResponseResultsInner**](CoreSearchGetResults200ResponseResultsInner.md) |  | 
**Totalcount** | **int32** | Total number of results | [default to null]

## Methods

### NewCoreSearchGetResults200Response

`func NewCoreSearchGetResults200Response(results []CoreSearchGetResults200ResponseResultsInner, totalcount int32, ) *CoreSearchGetResults200Response`

NewCoreSearchGetResults200Response instantiates a new CoreSearchGetResults200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreSearchGetResults200ResponseWithDefaults

`func NewCoreSearchGetResults200ResponseWithDefaults() *CoreSearchGetResults200Response`

NewCoreSearchGetResults200ResponseWithDefaults instantiates a new CoreSearchGetResults200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResults

`func (o *CoreSearchGetResults200Response) GetResults() []CoreSearchGetResults200ResponseResultsInner`

GetResults returns the Results field if non-nil, zero value otherwise.

### GetResultsOk

`func (o *CoreSearchGetResults200Response) GetResultsOk() (*[]CoreSearchGetResults200ResponseResultsInner, bool)`

GetResultsOk returns a tuple with the Results field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResults

`func (o *CoreSearchGetResults200Response) SetResults(v []CoreSearchGetResults200ResponseResultsInner)`

SetResults sets Results field to given value.


### GetTotalcount

`func (o *CoreSearchGetResults200Response) GetTotalcount() int32`

GetTotalcount returns the Totalcount field if non-nil, zero value otherwise.

### GetTotalcountOk

`func (o *CoreSearchGetResults200Response) GetTotalcountOk() (*int32, bool)`

GetTotalcountOk returns a tuple with the Totalcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalcount

`func (o *CoreSearchGetResults200Response) SetTotalcount(v int32)`

SetTotalcount sets Totalcount field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


