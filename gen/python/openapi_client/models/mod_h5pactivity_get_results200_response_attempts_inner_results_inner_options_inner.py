# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.mod_h5pactivity_get_results200_response_attempts_inner_results_inner_options_inner_correctanswer import ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer
from openapi_client.models.mod_h5pactivity_get_results200_response_attempts_inner_results_inner_options_inner_useranswer import ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer
from typing import Optional, Set
from typing_extensions import Self

class ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner(BaseModel):
    """
    ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner
    """ # noqa: E501
    correctanswer: Optional[ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer] = None
    description: Optional[StrictStr] = Field(default='null', description="Option description")
    id: Optional[StrictStr] = Field(default='null', description="Option string identifier")
    useranswer: Optional[ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer] = None
    __properties: ClassVar[List[str]] = ["correctanswer", "description", "id", "useranswer"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of correctanswer
        if self.correctanswer:
            _dict['correctanswer'] = self.correctanswer.to_dict()
        # override the default output from pydantic by calling `to_dict()` of useranswer
        if self.useranswer:
            _dict['useranswer'] = self.useranswer.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "correctanswer": ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer.from_dict(obj["correctanswer"]) if obj.get("correctanswer") is not None else None,
            "description": obj.get("description") if obj.get("description") is not None else 'null',
            "id": obj.get("id") if obj.get("id") is not None else 'null',
            "useranswer": ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer.from_dict(obj["useranswer"]) if obj.get("useranswer") is not None else None
        })
        return _obj


