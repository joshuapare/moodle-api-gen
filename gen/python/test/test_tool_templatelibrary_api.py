# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.tool_templatelibrary_api import ToolTemplatelibraryApi


class TestToolTemplatelibraryApi(unittest.TestCase):
    """ToolTemplatelibraryApi unit test stubs"""

    def setUp(self) -> None:
        self.api = ToolTemplatelibraryApi()

    def tearDown(self) -> None:
        pass

    def test_tool_templatelibrary_list_templates(self) -> None:
        """Test case for tool_templatelibrary_list_templates

        List/search templates by component.
        """
        pass

    def test_tool_templatelibrary_load_canonical_template(self) -> None:
        """Test case for tool_templatelibrary_load_canonical_template

        Load a canonical template by name (not the theme overidden one).
        """
        pass


if __name__ == '__main__':
    unittest.main()
