# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.tool_behat_api import ToolBehatApi


class TestToolBehatApi(unittest.TestCase):
    """ToolBehatApi unit test stubs"""

    def setUp(self) -> None:
        self.api = ToolBehatApi()

    def tearDown(self) -> None:
        pass

    def test_tool_behat_get_entity_generator(self) -> None:
        """Test case for tool_behat_get_entity_generator

        Get the generator details for an entity
        """
        pass


if __name__ == '__main__':
    unittest.main()