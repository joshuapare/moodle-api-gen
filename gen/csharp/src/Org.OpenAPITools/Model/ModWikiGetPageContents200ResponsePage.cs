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
    /// ModWikiGetPageContents200ResponsePage
    /// </summary>
    [DataContract(Name = "mod_wiki_get_page_contents_200_response_page")]
    public partial class ModWikiGetPageContents200ResponsePage : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWikiGetPageContents200ResponsePage" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModWikiGetPageContents200ResponsePage() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWikiGetPageContents200ResponsePage" /> class.
        /// </summary>
        /// <param name="cachedcontent">Page contents. (required).</param>
        /// <param name="caneditpage">True if user can edit the page. (required) (default to null).</param>
        /// <param name="contentformat">cachedcontent format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) (default to null).</param>
        /// <param name="groupid">Page&#39;s group ID. (required) (default to null).</param>
        /// <param name="id">Page ID. (required).</param>
        /// <param name="subwikiid">Page&#39;s subwiki ID. (required) (default to null).</param>
        /// <param name="tags">tags.</param>
        /// <param name="title">Page title. (required).</param>
        /// <param name="userid">Page&#39;s user ID. (required) (default to null).</param>
        /// <param name="varVersion">Latest version of the page. (default to null).</param>
        /// <param name="wikiid">Page&#39;s wiki ID. (required) (default to null).</param>
        public ModWikiGetPageContents200ResponsePage(string cachedcontent = default(string), bool caneditpage = null, int contentformat = null, int groupid = null, int id = default(int), int subwikiid = null, List<ModDataGetEntries200ResponseEntriesInnerTagsInner> tags = default(List<ModDataGetEntries200ResponseEntriesInnerTagsInner>), string title = default(string), int userid = null, int varVersion = null, int wikiid = null)
        {
            // to ensure "cachedcontent" is required (not null)
            if (cachedcontent == null)
            {
                throw new ArgumentNullException("cachedcontent is a required property for ModWikiGetPageContents200ResponsePage and cannot be null");
            }
            this.Cachedcontent = cachedcontent;
            this.Caneditpage = caneditpage;
            this.Groupid = groupid;
            this.Id = id;
            this.Subwikiid = subwikiid;
            // to ensure "title" is required (not null)
            if (title == null)
            {
                throw new ArgumentNullException("title is a required property for ModWikiGetPageContents200ResponsePage and cannot be null");
            }
            this.Title = title;
            this.Userid = userid;
            this.Wikiid = wikiid;
            this.Contentformat = contentformat;
            this.Tags = tags;
            this.VarVersion = varVersion;
        }

        /// <summary>
        /// Page contents.
        /// </summary>
        /// <value>Page contents.</value>
        [DataMember(Name = "cachedcontent", IsRequired = true, EmitDefaultValue = true)]
        public string Cachedcontent { get; set; }

        /// <summary>
        /// True if user can edit the page.
        /// </summary>
        /// <value>True if user can edit the page.</value>
        [DataMember(Name = "caneditpage", IsRequired = true, EmitDefaultValue = true)]
        public bool Caneditpage { get; set; }

        /// <summary>
        /// cachedcontent format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
        /// </summary>
        /// <value>cachedcontent format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)</value>
        [DataMember(Name = "contentformat", EmitDefaultValue = false)]
        public int Contentformat { get; set; }

        /// <summary>
        /// Page&#39;s group ID.
        /// </summary>
        /// <value>Page&#39;s group ID.</value>
        [DataMember(Name = "groupid", IsRequired = true, EmitDefaultValue = true)]
        public int Groupid { get; set; }

        /// <summary>
        /// Page ID.
        /// </summary>
        /// <value>Page ID.</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public int Id { get; set; }

        /// <summary>
        /// Page&#39;s subwiki ID.
        /// </summary>
        /// <value>Page&#39;s subwiki ID.</value>
        [DataMember(Name = "subwikiid", IsRequired = true, EmitDefaultValue = true)]
        public int Subwikiid { get; set; }

        /// <summary>
        /// Gets or Sets Tags
        /// </summary>
        [DataMember(Name = "tags", EmitDefaultValue = false)]
        public List<ModDataGetEntries200ResponseEntriesInnerTagsInner> Tags { get; set; }

        /// <summary>
        /// Page title.
        /// </summary>
        /// <value>Page title.</value>
        [DataMember(Name = "title", IsRequired = true, EmitDefaultValue = true)]
        public string Title { get; set; }

        /// <summary>
        /// Page&#39;s user ID.
        /// </summary>
        /// <value>Page&#39;s user ID.</value>
        [DataMember(Name = "userid", IsRequired = true, EmitDefaultValue = true)]
        public int Userid { get; set; }

        /// <summary>
        /// Latest version of the page.
        /// </summary>
        /// <value>Latest version of the page.</value>
        [DataMember(Name = "version", EmitDefaultValue = false)]
        public int VarVersion { get; set; }

        /// <summary>
        /// Page&#39;s wiki ID.
        /// </summary>
        /// <value>Page&#39;s wiki ID.</value>
        [DataMember(Name = "wikiid", IsRequired = true, EmitDefaultValue = true)]
        public int Wikiid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModWikiGetPageContents200ResponsePage {\n");
            sb.Append("  Cachedcontent: ").Append(Cachedcontent).Append("\n");
            sb.Append("  Caneditpage: ").Append(Caneditpage).Append("\n");
            sb.Append("  Contentformat: ").Append(Contentformat).Append("\n");
            sb.Append("  Groupid: ").Append(Groupid).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Subwikiid: ").Append(Subwikiid).Append("\n");
            sb.Append("  Tags: ").Append(Tags).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Userid: ").Append(Userid).Append("\n");
            sb.Append("  VarVersion: ").Append(VarVersion).Append("\n");
            sb.Append("  Wikiid: ").Append(Wikiid).Append("\n");
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