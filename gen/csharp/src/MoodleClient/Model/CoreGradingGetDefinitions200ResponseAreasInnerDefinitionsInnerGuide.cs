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
    /// CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide
    /// </summary>
    [DataContract(Name = "core_grading_get_definitions_200_response_areas_inner_definitions_inner_guide")]
    public partial class CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide" /> class.
        /// </summary>
        /// <param name="guideComments">guideComments.</param>
        /// <param name="guideCriteria">guideCriteria.</param>
        public CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide(List<CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInner> guideComments = default(List<CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInner>), List<CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCriteriaInner> guideCriteria = default(List<CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCriteriaInner>))
        {
            this.GuideComments = guideComments;
            this.GuideCriteria = guideCriteria;
        }

        /// <summary>
        /// Gets or Sets GuideComments
        /// </summary>
        [DataMember(Name = "guide_comments", EmitDefaultValue = false)]
        public List<CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInner> GuideComments { get; set; }

        /// <summary>
        /// Gets or Sets GuideCriteria
        /// </summary>
        [DataMember(Name = "guide_criteria", EmitDefaultValue = false)]
        public List<CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCriteriaInner> GuideCriteria { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide {\n");
            sb.Append("  GuideComments: ").Append(GuideComments).Append("\n");
            sb.Append("  GuideCriteria: ").Append(GuideCriteria).Append("\n");
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