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
    /// ToolLpDataForRelatedCompetenciesSection200Response
    /// </summary>
    [DataContract(Name = "tool_lp_data_for_related_competencies_section_200_response")]
    public partial class ToolLpDataForRelatedCompetenciesSection200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolLpDataForRelatedCompetenciesSection200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ToolLpDataForRelatedCompetenciesSection200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolLpDataForRelatedCompetenciesSection200Response" /> class.
        /// </summary>
        /// <param name="relatedcompetencies">relatedcompetencies (required).</param>
        /// <param name="showdeleterelatedaction">Whether to show the delete relation link or not (required) (default to null).</param>
        public ToolLpDataForRelatedCompetenciesSection200Response(List<CoreCompetencyReadUserEvidence200ResponseCompetenciesInner> relatedcompetencies = default(List<CoreCompetencyReadUserEvidence200ResponseCompetenciesInner>), bool showdeleterelatedaction = null)
        {
            // to ensure "relatedcompetencies" is required (not null)
            if (relatedcompetencies == null)
            {
                throw new ArgumentNullException("relatedcompetencies is a required property for ToolLpDataForRelatedCompetenciesSection200Response and cannot be null");
            }
            this.Relatedcompetencies = relatedcompetencies;
            this.Showdeleterelatedaction = showdeleterelatedaction;
        }

        /// <summary>
        /// Gets or Sets Relatedcompetencies
        /// </summary>
        [DataMember(Name = "relatedcompetencies", IsRequired = true, EmitDefaultValue = true)]
        public List<CoreCompetencyReadUserEvidence200ResponseCompetenciesInner> Relatedcompetencies { get; set; }

        /// <summary>
        /// Whether to show the delete relation link or not
        /// </summary>
        /// <value>Whether to show the delete relation link or not</value>
        [DataMember(Name = "showdeleterelatedaction", IsRequired = true, EmitDefaultValue = true)]
        public bool Showdeleterelatedaction { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ToolLpDataForRelatedCompetenciesSection200Response {\n");
            sb.Append("  Relatedcompetencies: ").Append(Relatedcompetencies).Append("\n");
            sb.Append("  Showdeleterelatedaction: ").Append(Showdeleterelatedaction).Append("\n");
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
