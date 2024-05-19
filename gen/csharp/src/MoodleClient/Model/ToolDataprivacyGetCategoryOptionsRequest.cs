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
    /// ToolDataprivacyGetCategoryOptionsRequest
    /// </summary>
    [DataContract(Name = "tool_dataprivacy_get_category_options_request")]
    public partial class ToolDataprivacyGetCategoryOptionsRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolDataprivacyGetCategoryOptionsRequest" /> class.
        /// </summary>
        /// <param name="includeinherit">Include option \&quot;Inherit\&quot; (default to true).</param>
        /// <param name="includenotset">Include option \&quot;Not set\&quot; (default to false).</param>
        public ToolDataprivacyGetCategoryOptionsRequest(bool includeinherit = true, bool includenotset = false)
        {
            this.Includeinherit = includeinherit;
            this.Includenotset = includenotset;
        }

        /// <summary>
        /// Include option \&quot;Inherit\&quot;
        /// </summary>
        /// <value>Include option \&quot;Inherit\&quot;</value>
        [DataMember(Name = "includeinherit", EmitDefaultValue = true)]
        public bool Includeinherit { get; set; }

        /// <summary>
        /// Include option \&quot;Not set\&quot;
        /// </summary>
        /// <value>Include option \&quot;Not set\&quot;</value>
        [DataMember(Name = "includenotset", EmitDefaultValue = true)]
        public bool Includenotset { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ToolDataprivacyGetCategoryOptionsRequest {\n");
            sb.Append("  Includeinherit: ").Append(Includeinherit).Append("\n");
            sb.Append("  Includenotset: ").Append(Includenotset).Append("\n");
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
