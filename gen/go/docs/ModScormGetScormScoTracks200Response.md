# ModScormGetScormScoTracks200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**ModScormGetScormScoTracks200ResponseData**](ModScormGetScormScoTracks200ResponseData.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModScormGetScormScoTracks200Response

`func NewModScormGetScormScoTracks200Response(data ModScormGetScormScoTracks200ResponseData, ) *ModScormGetScormScoTracks200Response`

NewModScormGetScormScoTracks200Response instantiates a new ModScormGetScormScoTracks200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModScormGetScormScoTracks200ResponseWithDefaults

`func NewModScormGetScormScoTracks200ResponseWithDefaults() *ModScormGetScormScoTracks200Response`

NewModScormGetScormScoTracks200ResponseWithDefaults instantiates a new ModScormGetScormScoTracks200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *ModScormGetScormScoTracks200Response) GetData() ModScormGetScormScoTracks200ResponseData`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ModScormGetScormScoTracks200Response) GetDataOk() (*ModScormGetScormScoTracks200ResponseData, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ModScormGetScormScoTracks200Response) SetData(v ModScormGetScormScoTracks200ResponseData)`

SetData sets Data field to given value.


### GetWarnings

`func (o *ModScormGetScormScoTracks200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModScormGetScormScoTracks200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModScormGetScormScoTracks200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModScormGetScormScoTracks200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


