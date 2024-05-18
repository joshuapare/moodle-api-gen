# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.block_accessreview_api import BlockAccessreviewApi


class TestBlockAccessreviewApi(unittest.TestCase):
    """BlockAccessreviewApi unit test stubs"""

    def setUp(self) -> None:
        self.api = BlockAccessreviewApi()

    def tearDown(self) -> None:
        pass

    def test_block_accessreview_get_module_data(self) -> None:
        """Test case for block_accessreview_get_module_data

        Gets error data for course modules.
        """
        pass

    def test_block_accessreview_get_section_data(self) -> None:
        """Test case for block_accessreview_get_section_data

        Gets error data for course sections.
        """
        pass


if __name__ == '__main__':
    unittest.main()