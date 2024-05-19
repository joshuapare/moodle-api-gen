/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// BlockIomadCompanyAdminGetLicenseFromIdRequest
    /// </summary>
    [DataContract(Name = "block_iomad_company_admin_get_license_from_id_request")]
    public partial class BlockIomadCompanyAdminGetLicenseFromIdRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BlockIomadCompanyAdminGetLicenseFromIdRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected BlockIomadCompanyAdminGetLicenseFromIdRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="BlockIomadCompanyAdminGetLicenseFromIdRequest" /> class.
        /// </summary>
        /// <param name="licenseid">License ID. (required) (default to null).</param>
        public BlockIomadCompanyAdminGetLicenseFromIdRequest(int licenseid = null)
        {
            this.Licenseid = licenseid;
        }

        /// <summary>
        /// License ID.
        /// </summary>
        /// <value>License ID.</value>
        [DataMember(Name = "licenseid", IsRequired = true, EmitDefaultValue = true)]
        public int Licenseid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BlockIomadCompanyAdminGetLicenseFromIdRequest {\n");
            sb.Append("  Licenseid: ").Append(Licenseid).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
