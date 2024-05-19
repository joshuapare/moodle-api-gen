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
    /// ToolDataprivacyTreeExtraBranchesRequest
    /// </summary>
    [DataContract(Name = "tool_dataprivacy_tree_extra_branches_request")]
    public partial class ToolDataprivacyTreeExtraBranchesRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolDataprivacyTreeExtraBranchesRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ToolDataprivacyTreeExtraBranchesRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolDataprivacyTreeExtraBranchesRequest" /> class.
        /// </summary>
        /// <param name="contextid">The context id to expand (required) (default to null).</param>
        /// <param name="element">The element we are interested on (required) (default to &quot;null&quot;).</param>
        public ToolDataprivacyTreeExtraBranchesRequest(int contextid = null, string element = @"null")
        {
            this.Contextid = contextid;
            // to ensure "element" is required (not null)
            if (element == null)
            {
                throw new ArgumentNullException("element is a required property for ToolDataprivacyTreeExtraBranchesRequest and cannot be null");
            }
            this.Element = element;
        }

        /// <summary>
        /// The context id to expand
        /// </summary>
        /// <value>The context id to expand</value>
        [DataMember(Name = "contextid", IsRequired = true, EmitDefaultValue = true)]
        public int Contextid { get; set; }

        /// <summary>
        /// The element we are interested on
        /// </summary>
        /// <value>The element we are interested on</value>
        [DataMember(Name = "element", IsRequired = true, EmitDefaultValue = true)]
        public string Element { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ToolDataprivacyTreeExtraBranchesRequest {\n");
            sb.Append("  Contextid: ").Append(Contextid).Append("\n");
            sb.Append("  Element: ").Append(Element).Append("\n");
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
