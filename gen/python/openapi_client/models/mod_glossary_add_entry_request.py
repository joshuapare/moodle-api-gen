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

from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.mod_glossary_add_entry_request_options_inner import ModGlossaryAddEntryRequestOptionsInner
from typing import Optional, Set
from typing_extensions import Self

class ModGlossaryAddEntryRequest(BaseModel):
    """
    ModGlossaryAddEntryRequest
    """ # noqa: E501
    concept: StrictStr = Field(description="Glossary concept")
    definition: StrictStr = Field(description="Glossary concept definition")
    definitionformat: StrictInt = Field(description="definition format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)")
    glossaryid: StrictInt = Field(description="Glossary id")
    options: Optional[List[ModGlossaryAddEntryRequestOptionsInner]] = None
    __properties: ClassVar[List[str]] = ["concept", "definition", "definitionformat", "glossaryid", "options"]

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
        """Create an instance of ModGlossaryAddEntryRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in options (list)
        _items = []
        if self.options:
            for _item in self.options:
                if _item:
                    _items.append(_item.to_dict())
            _dict['options'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ModGlossaryAddEntryRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "concept": obj.get("concept") if obj.get("concept") is not None else 'null',
            "definition": obj.get("definition") if obj.get("definition") is not None else 'null',
            "definitionformat": obj.get("definitionformat"),
            "glossaryid": obj.get("glossaryid") if obj.get("glossaryid") is not None else null,
            "options": [ModGlossaryAddEntryRequestOptionsInner.from_dict(_item) for _item in obj["options"]] if obj.get("options") is not None else None
        })
        return _obj


