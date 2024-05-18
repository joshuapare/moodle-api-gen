# ModWorkshopGetSubmissions200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Submissions** | [**[]ModWorkshopGetSubmissions200ResponseSubmissionsInner**](ModWorkshopGetSubmissions200ResponseSubmissionsInner.md) |  | 
**Totalcount** | **int32** | Total count of submissions. | [default to null]
**Totalfilesize** | **int32** | Total size (bytes) of the files attached to all the                     submissions (even the ones not returned due to pagination). | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModWorkshopGetSubmissions200Response

`func NewModWorkshopGetSubmissions200Response(submissions []ModWorkshopGetSubmissions200ResponseSubmissionsInner, totalcount int32, totalfilesize int32, ) *ModWorkshopGetSubmissions200Response`

NewModWorkshopGetSubmissions200Response instantiates a new ModWorkshopGetSubmissions200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopGetSubmissions200ResponseWithDefaults

`func NewModWorkshopGetSubmissions200ResponseWithDefaults() *ModWorkshopGetSubmissions200Response`

NewModWorkshopGetSubmissions200ResponseWithDefaults instantiates a new ModWorkshopGetSubmissions200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSubmissions

`func (o *ModWorkshopGetSubmissions200Response) GetSubmissions() []ModWorkshopGetSubmissions200ResponseSubmissionsInner`

GetSubmissions returns the Submissions field if non-nil, zero value otherwise.

### GetSubmissionsOk

`func (o *ModWorkshopGetSubmissions200Response) GetSubmissionsOk() (*[]ModWorkshopGetSubmissions200ResponseSubmissionsInner, bool)`

GetSubmissionsOk returns a tuple with the Submissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissions

`func (o *ModWorkshopGetSubmissions200Response) SetSubmissions(v []ModWorkshopGetSubmissions200ResponseSubmissionsInner)`

SetSubmissions sets Submissions field to given value.


### GetTotalcount

`func (o *ModWorkshopGetSubmissions200Response) GetTotalcount() int32`

GetTotalcount returns the Totalcount field if non-nil, zero value otherwise.

### GetTotalcountOk

`func (o *ModWorkshopGetSubmissions200Response) GetTotalcountOk() (*int32, bool)`

GetTotalcountOk returns a tuple with the Totalcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalcount

`func (o *ModWorkshopGetSubmissions200Response) SetTotalcount(v int32)`

SetTotalcount sets Totalcount field to given value.


### GetTotalfilesize

`func (o *ModWorkshopGetSubmissions200Response) GetTotalfilesize() int32`

GetTotalfilesize returns the Totalfilesize field if non-nil, zero value otherwise.

### GetTotalfilesizeOk

`func (o *ModWorkshopGetSubmissions200Response) GetTotalfilesizeOk() (*int32, bool)`

GetTotalfilesizeOk returns a tuple with the Totalfilesize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalfilesize

`func (o *ModWorkshopGetSubmissions200Response) SetTotalfilesize(v int32)`

SetTotalfilesize sets Totalfilesize field to given value.


### GetWarnings

`func (o *ModWorkshopGetSubmissions200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModWorkshopGetSubmissions200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModWorkshopGetSubmissions200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModWorkshopGetSubmissions200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


