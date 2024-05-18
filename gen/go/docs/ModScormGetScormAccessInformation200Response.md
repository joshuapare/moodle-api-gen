# ModScormGetScormAccessInformation200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canaddinstance** | Pointer to **bool** | Whether the user has the capability mod/scorm:addinstance allowed. | [optional] [default to null]
**Candeleteownresponses** | Pointer to **bool** | Whether the user has the capability mod/scorm:deleteownresponses allowed. | [optional] [default to null]
**Candeleteresponses** | Pointer to **bool** | Whether the user has the capability mod/scorm:deleteresponses allowed. | [optional] [default to null]
**Cansavetrack** | Pointer to **bool** | Whether the user has the capability mod/scorm:savetrack allowed. | [optional] [default to null]
**Canskipview** | Pointer to **bool** | Whether the user has the capability mod/scorm:skipview allowed. | [optional] [default to null]
**Canviewreport** | Pointer to **bool** | Whether the user has the capability mod/scorm:viewreport allowed. | [optional] [default to null]
**Canviewscores** | Pointer to **bool** | Whether the user has the capability mod/scorm:viewscores allowed. | [optional] [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModScormGetScormAccessInformation200Response

`func NewModScormGetScormAccessInformation200Response() *ModScormGetScormAccessInformation200Response`

NewModScormGetScormAccessInformation200Response instantiates a new ModScormGetScormAccessInformation200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModScormGetScormAccessInformation200ResponseWithDefaults

`func NewModScormGetScormAccessInformation200ResponseWithDefaults() *ModScormGetScormAccessInformation200Response`

NewModScormGetScormAccessInformation200ResponseWithDefaults instantiates a new ModScormGetScormAccessInformation200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanaddinstance

`func (o *ModScormGetScormAccessInformation200Response) GetCanaddinstance() bool`

GetCanaddinstance returns the Canaddinstance field if non-nil, zero value otherwise.

### GetCanaddinstanceOk

`func (o *ModScormGetScormAccessInformation200Response) GetCanaddinstanceOk() (*bool, bool)`

GetCanaddinstanceOk returns a tuple with the Canaddinstance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanaddinstance

`func (o *ModScormGetScormAccessInformation200Response) SetCanaddinstance(v bool)`

SetCanaddinstance sets Canaddinstance field to given value.

### HasCanaddinstance

`func (o *ModScormGetScormAccessInformation200Response) HasCanaddinstance() bool`

HasCanaddinstance returns a boolean if a field has been set.

### GetCandeleteownresponses

`func (o *ModScormGetScormAccessInformation200Response) GetCandeleteownresponses() bool`

GetCandeleteownresponses returns the Candeleteownresponses field if non-nil, zero value otherwise.

### GetCandeleteownresponsesOk

`func (o *ModScormGetScormAccessInformation200Response) GetCandeleteownresponsesOk() (*bool, bool)`

GetCandeleteownresponsesOk returns a tuple with the Candeleteownresponses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCandeleteownresponses

`func (o *ModScormGetScormAccessInformation200Response) SetCandeleteownresponses(v bool)`

SetCandeleteownresponses sets Candeleteownresponses field to given value.

### HasCandeleteownresponses

`func (o *ModScormGetScormAccessInformation200Response) HasCandeleteownresponses() bool`

HasCandeleteownresponses returns a boolean if a field has been set.

### GetCandeleteresponses

`func (o *ModScormGetScormAccessInformation200Response) GetCandeleteresponses() bool`

GetCandeleteresponses returns the Candeleteresponses field if non-nil, zero value otherwise.

### GetCandeleteresponsesOk

`func (o *ModScormGetScormAccessInformation200Response) GetCandeleteresponsesOk() (*bool, bool)`

GetCandeleteresponsesOk returns a tuple with the Candeleteresponses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCandeleteresponses

`func (o *ModScormGetScormAccessInformation200Response) SetCandeleteresponses(v bool)`

SetCandeleteresponses sets Candeleteresponses field to given value.

### HasCandeleteresponses

`func (o *ModScormGetScormAccessInformation200Response) HasCandeleteresponses() bool`

HasCandeleteresponses returns a boolean if a field has been set.

### GetCansavetrack

`func (o *ModScormGetScormAccessInformation200Response) GetCansavetrack() bool`

GetCansavetrack returns the Cansavetrack field if non-nil, zero value otherwise.

### GetCansavetrackOk

`func (o *ModScormGetScormAccessInformation200Response) GetCansavetrackOk() (*bool, bool)`

GetCansavetrackOk returns a tuple with the Cansavetrack field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCansavetrack

`func (o *ModScormGetScormAccessInformation200Response) SetCansavetrack(v bool)`

SetCansavetrack sets Cansavetrack field to given value.

### HasCansavetrack

`func (o *ModScormGetScormAccessInformation200Response) HasCansavetrack() bool`

HasCansavetrack returns a boolean if a field has been set.

### GetCanskipview

`func (o *ModScormGetScormAccessInformation200Response) GetCanskipview() bool`

GetCanskipview returns the Canskipview field if non-nil, zero value otherwise.

### GetCanskipviewOk

`func (o *ModScormGetScormAccessInformation200Response) GetCanskipviewOk() (*bool, bool)`

GetCanskipviewOk returns a tuple with the Canskipview field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanskipview

`func (o *ModScormGetScormAccessInformation200Response) SetCanskipview(v bool)`

SetCanskipview sets Canskipview field to given value.

### HasCanskipview

`func (o *ModScormGetScormAccessInformation200Response) HasCanskipview() bool`

HasCanskipview returns a boolean if a field has been set.

### GetCanviewreport

`func (o *ModScormGetScormAccessInformation200Response) GetCanviewreport() bool`

GetCanviewreport returns the Canviewreport field if non-nil, zero value otherwise.

### GetCanviewreportOk

`func (o *ModScormGetScormAccessInformation200Response) GetCanviewreportOk() (*bool, bool)`

GetCanviewreportOk returns a tuple with the Canviewreport field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewreport

`func (o *ModScormGetScormAccessInformation200Response) SetCanviewreport(v bool)`

SetCanviewreport sets Canviewreport field to given value.

### HasCanviewreport

`func (o *ModScormGetScormAccessInformation200Response) HasCanviewreport() bool`

HasCanviewreport returns a boolean if a field has been set.

### GetCanviewscores

`func (o *ModScormGetScormAccessInformation200Response) GetCanviewscores() bool`

GetCanviewscores returns the Canviewscores field if non-nil, zero value otherwise.

### GetCanviewscoresOk

`func (o *ModScormGetScormAccessInformation200Response) GetCanviewscoresOk() (*bool, bool)`

GetCanviewscoresOk returns a tuple with the Canviewscores field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewscores

`func (o *ModScormGetScormAccessInformation200Response) SetCanviewscores(v bool)`

SetCanviewscores sets Canviewscores field to given value.

### HasCanviewscores

`func (o *ModScormGetScormAccessInformation200Response) HasCanviewscores() bool`

HasCanviewscores returns a boolean if a field has been set.

### GetWarnings

`func (o *ModScormGetScormAccessInformation200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModScormGetScormAccessInformation200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModScormGetScormAccessInformation200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModScormGetScormAccessInformation200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


