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
    /// ModWorkshopGetUserPlan200ResponseUserplan
    /// </summary>
    [DataContract(Name = "mod_workshop_get_user_plan_200_response_userplan")]
    public partial class ModWorkshopGetUserPlan200ResponseUserplan : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWorkshopGetUserPlan200ResponseUserplan" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModWorkshopGetUserPlan200ResponseUserplan() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWorkshopGetUserPlan200ResponseUserplan" /> class.
        /// </summary>
        /// <param name="examples">examples (required).</param>
        /// <param name="phases">phases (required).</param>
        public ModWorkshopGetUserPlan200ResponseUserplan(List<ModWorkshopGetUserPlan200ResponseUserplanExamplesInner> examples = default(List<ModWorkshopGetUserPlan200ResponseUserplanExamplesInner>), List<ModWorkshopGetUserPlan200ResponseUserplanPhasesInner> phases = default(List<ModWorkshopGetUserPlan200ResponseUserplanPhasesInner>))
        {
            // to ensure "examples" is required (not null)
            if (examples == null)
            {
                throw new ArgumentNullException("examples is a required property for ModWorkshopGetUserPlan200ResponseUserplan and cannot be null");
            }
            this.Examples = examples;
            // to ensure "phases" is required (not null)
            if (phases == null)
            {
                throw new ArgumentNullException("phases is a required property for ModWorkshopGetUserPlan200ResponseUserplan and cannot be null");
            }
            this.Phases = phases;
        }

        /// <summary>
        /// Gets or Sets Examples
        /// </summary>
        [DataMember(Name = "examples", IsRequired = true, EmitDefaultValue = true)]
        public List<ModWorkshopGetUserPlan200ResponseUserplanExamplesInner> Examples { get; set; }

        /// <summary>
        /// Gets or Sets Phases
        /// </summary>
        [DataMember(Name = "phases", IsRequired = true, EmitDefaultValue = true)]
        public List<ModWorkshopGetUserPlan200ResponseUserplanPhasesInner> Phases { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModWorkshopGetUserPlan200ResponseUserplan {\n");
            sb.Append("  Examples: ").Append(Examples).Append("\n");
            sb.Append("  Phases: ").Append(Phases).Append("\n");
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
