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
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ToolIomadpolicyGetIomadpolicyVersionRequest
    /// </summary>
    [DataContract(Name = "tool_iomadpolicy_get_iomadpolicy_version_request")]
    public partial class ToolIomadpolicyGetIomadpolicyVersionRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolIomadpolicyGetIomadpolicyVersionRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ToolIomadpolicyGetIomadpolicyVersionRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolIomadpolicyGetIomadpolicyVersionRequest" /> class.
        /// </summary>
        /// <param name="behalfid">The id of user on whose behalf the user is viewing the iomadpolicy (default to 0).</param>
        /// <param name="versionid">The iomadpolicy version ID (required) (default to null).</param>
        public ToolIomadpolicyGetIomadpolicyVersionRequest(int behalfid = 0, int versionid = null)
        {
            this.Versionid = versionid;
            this.Behalfid = behalfid;
        }

        /// <summary>
        /// The id of user on whose behalf the user is viewing the iomadpolicy
        /// </summary>
        /// <value>The id of user on whose behalf the user is viewing the iomadpolicy</value>
        [DataMember(Name = "behalfid", EmitDefaultValue = false)]
        public int Behalfid { get; set; }

        /// <summary>
        /// The iomadpolicy version ID
        /// </summary>
        /// <value>The iomadpolicy version ID</value>
        [DataMember(Name = "versionid", IsRequired = true, EmitDefaultValue = true)]
        public int Versionid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ToolIomadpolicyGetIomadpolicyVersionRequest {\n");
            sb.Append("  Behalfid: ").Append(Behalfid).Append("\n");
            sb.Append("  Versionid: ").Append(Versionid).Append("\n");
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
