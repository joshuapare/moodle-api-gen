# ModQuizGetQuizAccessInformation200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Accessrules** | **[]map[string]interface{}** |  | 
**Activerulenames** | **[]map[string]interface{}** |  | 
**Canattempt** | **bool** | Whether the user can do the quiz or not. | [default to null]
**Canmanage** | **bool** | Whether the user can edit the quiz settings or not. | [default to null]
**Canpreview** | **bool** | Whether the user can preview the quiz or not. | [default to null]
**Canreviewmyattempts** | **bool** | Whether the users can review their previous attempts                                                                 or not. | [default to null]
**Canviewreports** | **bool** | Whether the user can view the quiz reports or not. | [default to null]
**Preventaccessreasons** | **[]map[string]interface{}** |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModQuizGetQuizAccessInformation200Response

`func NewModQuizGetQuizAccessInformation200Response(accessrules []map[string]interface{}, activerulenames []map[string]interface{}, canattempt bool, canmanage bool, canpreview bool, canreviewmyattempts bool, canviewreports bool, preventaccessreasons []map[string]interface{}, ) *ModQuizGetQuizAccessInformation200Response`

NewModQuizGetQuizAccessInformation200Response instantiates a new ModQuizGetQuizAccessInformation200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizGetQuizAccessInformation200ResponseWithDefaults

`func NewModQuizGetQuizAccessInformation200ResponseWithDefaults() *ModQuizGetQuizAccessInformation200Response`

NewModQuizGetQuizAccessInformation200ResponseWithDefaults instantiates a new ModQuizGetQuizAccessInformation200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAccessrules

`func (o *ModQuizGetQuizAccessInformation200Response) GetAccessrules() []map[string]interface{}`

GetAccessrules returns the Accessrules field if non-nil, zero value otherwise.

### GetAccessrulesOk

`func (o *ModQuizGetQuizAccessInformation200Response) GetAccessrulesOk() (*[]map[string]interface{}, bool)`

GetAccessrulesOk returns a tuple with the Accessrules field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccessrules

`func (o *ModQuizGetQuizAccessInformation200Response) SetAccessrules(v []map[string]interface{})`

SetAccessrules sets Accessrules field to given value.


### GetActiverulenames

`func (o *ModQuizGetQuizAccessInformation200Response) GetActiverulenames() []map[string]interface{}`

GetActiverulenames returns the Activerulenames field if non-nil, zero value otherwise.

### GetActiverulenamesOk

`func (o *ModQuizGetQuizAccessInformation200Response) GetActiverulenamesOk() (*[]map[string]interface{}, bool)`

GetActiverulenamesOk returns a tuple with the Activerulenames field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActiverulenames

`func (o *ModQuizGetQuizAccessInformation200Response) SetActiverulenames(v []map[string]interface{})`

SetActiverulenames sets Activerulenames field to given value.


### GetCanattempt

`func (o *ModQuizGetQuizAccessInformation200Response) GetCanattempt() bool`

GetCanattempt returns the Canattempt field if non-nil, zero value otherwise.

### GetCanattemptOk

`func (o *ModQuizGetQuizAccessInformation200Response) GetCanattemptOk() (*bool, bool)`

GetCanattemptOk returns a tuple with the Canattempt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanattempt

`func (o *ModQuizGetQuizAccessInformation200Response) SetCanattempt(v bool)`

SetCanattempt sets Canattempt field to given value.


### GetCanmanage

`func (o *ModQuizGetQuizAccessInformation200Response) GetCanmanage() bool`

GetCanmanage returns the Canmanage field if non-nil, zero value otherwise.

### GetCanmanageOk

`func (o *ModQuizGetQuizAccessInformation200Response) GetCanmanageOk() (*bool, bool)`

GetCanmanageOk returns a tuple with the Canmanage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanage

`func (o *ModQuizGetQuizAccessInformation200Response) SetCanmanage(v bool)`

SetCanmanage sets Canmanage field to given value.


### GetCanpreview

`func (o *ModQuizGetQuizAccessInformation200Response) GetCanpreview() bool`

GetCanpreview returns the Canpreview field if non-nil, zero value otherwise.

### GetCanpreviewOk

`func (o *ModQuizGetQuizAccessInformation200Response) GetCanpreviewOk() (*bool, bool)`

GetCanpreviewOk returns a tuple with the Canpreview field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanpreview

`func (o *ModQuizGetQuizAccessInformation200Response) SetCanpreview(v bool)`

SetCanpreview sets Canpreview field to given value.


### GetCanreviewmyattempts

`func (o *ModQuizGetQuizAccessInformation200Response) GetCanreviewmyattempts() bool`

GetCanreviewmyattempts returns the Canreviewmyattempts field if non-nil, zero value otherwise.

### GetCanreviewmyattemptsOk

`func (o *ModQuizGetQuizAccessInformation200Response) GetCanreviewmyattemptsOk() (*bool, bool)`

GetCanreviewmyattemptsOk returns a tuple with the Canreviewmyattempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanreviewmyattempts

`func (o *ModQuizGetQuizAccessInformation200Response) SetCanreviewmyattempts(v bool)`

SetCanreviewmyattempts sets Canreviewmyattempts field to given value.


### GetCanviewreports

`func (o *ModQuizGetQuizAccessInformation200Response) GetCanviewreports() bool`

GetCanviewreports returns the Canviewreports field if non-nil, zero value otherwise.

### GetCanviewreportsOk

`func (o *ModQuizGetQuizAccessInformation200Response) GetCanviewreportsOk() (*bool, bool)`

GetCanviewreportsOk returns a tuple with the Canviewreports field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewreports

`func (o *ModQuizGetQuizAccessInformation200Response) SetCanviewreports(v bool)`

SetCanviewreports sets Canviewreports field to given value.


### GetPreventaccessreasons

`func (o *ModQuizGetQuizAccessInformation200Response) GetPreventaccessreasons() []map[string]interface{}`

GetPreventaccessreasons returns the Preventaccessreasons field if non-nil, zero value otherwise.

### GetPreventaccessreasonsOk

`func (o *ModQuizGetQuizAccessInformation200Response) GetPreventaccessreasonsOk() (*[]map[string]interface{}, bool)`

GetPreventaccessreasonsOk returns a tuple with the Preventaccessreasons field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreventaccessreasons

`func (o *ModQuizGetQuizAccessInformation200Response) SetPreventaccessreasons(v []map[string]interface{})`

SetPreventaccessreasons sets Preventaccessreasons field to given value.


### GetWarnings

`func (o *ModQuizGetQuizAccessInformation200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModQuizGetQuizAccessInformation200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModQuizGetQuizAccessInformation200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModQuizGetQuizAccessInformation200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


