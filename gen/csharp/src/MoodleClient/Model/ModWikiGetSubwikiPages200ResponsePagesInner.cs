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
    /// Pages
    /// </summary>
    [DataContract(Name = "mod_wiki_get_subwiki_pages_200_response_pages_inner")]
    public partial class ModWikiGetSubwikiPages200ResponsePagesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWikiGetSubwikiPages200ResponsePagesInner" /> class.
        /// </summary>
        /// <param name="cachedcontent">Page contents..</param>
        /// <param name="caneditpage">True if user can edit the page..</param>
        /// <param name="contentformat">cachedcontent format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN).</param>
        /// <param name="contentsize">Size of page contents in bytes (doesn&#39;t include size of attached files). (default to null).</param>
        /// <param name="firstpage">True if it&#39;s the first page. (default to null).</param>
        /// <param name="id">Page ID..</param>
        /// <param name="pageviews">Number of times the page has been viewed. (default to null).</param>
        /// <param name="varReadonly">1 if readonly, 0 otherwise. (default to null).</param>
        /// <param name="subwikiid">Page&#39;s subwiki ID..</param>
        /// <param name="tags">tags.</param>
        /// <param name="timecreated">Time of creation. (default to null).</param>
        /// <param name="timemodified">Time of last modification. (default to null).</param>
        /// <param name="timerendered">Time of last renderization. (default to null).</param>
        /// <param name="title">Page title..</param>
        /// <param name="userid">ID of the user that last modified the page. (default to null).</param>
        public ModWikiGetSubwikiPages200ResponsePagesInner(string cachedcontent = default(string), bool caneditpage = default(bool), int contentformat = default(int), int contentsize = null, bool firstpage = null, int id = default(int), int pageviews = null, int varReadonly = null, int subwikiid = default(int), List<ModDataGetEntries200ResponseEntriesInnerTagsInner> tags = default(List<ModDataGetEntries200ResponseEntriesInnerTagsInner>), int timecreated = null, int timemodified = null, int timerendered = null, string title = default(string), int userid = null)
        {
            this.Cachedcontent = cachedcontent;
            this.Caneditpage = caneditpage;
            this.Contentformat = contentformat;
            this.Contentsize = contentsize;
            this.Firstpage = firstpage;
            this.Id = id;
            this.Pageviews = pageviews;
            this.Readonly = varReadonly;
            this.Subwikiid = subwikiid;
            this.Tags = tags;
            this.Timecreated = timecreated;
            this.Timemodified = timemodified;
            this.Timerendered = timerendered;
            this.Title = title;
            this.Userid = userid;
        }

        /// <summary>
        /// Page contents.
        /// </summary>
        /// <value>Page contents.</value>
        [DataMember(Name = "cachedcontent", EmitDefaultValue = false)]
        public string Cachedcontent { get; set; }

        /// <summary>
        /// True if user can edit the page.
        /// </summary>
        /// <value>True if user can edit the page.</value>
        [DataMember(Name = "caneditpage", EmitDefaultValue = true)]
        public bool Caneditpage { get; set; }

        /// <summary>
        /// cachedcontent format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
        /// </summary>
        /// <value>cachedcontent format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)</value>
        [DataMember(Name = "contentformat", EmitDefaultValue = false)]
        public int Contentformat { get; set; }

        /// <summary>
        /// Size of page contents in bytes (doesn&#39;t include size of attached files).
        /// </summary>
        /// <value>Size of page contents in bytes (doesn&#39;t include size of attached files).</value>
        [DataMember(Name = "contentsize", EmitDefaultValue = false)]
        public int Contentsize { get; set; }

        /// <summary>
        /// True if it&#39;s the first page.
        /// </summary>
        /// <value>True if it&#39;s the first page.</value>
        [DataMember(Name = "firstpage", EmitDefaultValue = true)]
        public bool Firstpage { get; set; }

        /// <summary>
        /// Page ID.
        /// </summary>
        /// <value>Page ID.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// Number of times the page has been viewed.
        /// </summary>
        /// <value>Number of times the page has been viewed.</value>
        [DataMember(Name = "pageviews", EmitDefaultValue = false)]
        public int Pageviews { get; set; }

        /// <summary>
        /// 1 if readonly, 0 otherwise.
        /// </summary>
        /// <value>1 if readonly, 0 otherwise.</value>
        [DataMember(Name = "readonly", EmitDefaultValue = false)]
        public int Readonly { get; set; }

        /// <summary>
        /// Page&#39;s subwiki ID.
        /// </summary>
        /// <value>Page&#39;s subwiki ID.</value>
        [DataMember(Name = "subwikiid", EmitDefaultValue = false)]
        public int Subwikiid { get; set; }

        /// <summary>
        /// Gets or Sets Tags
        /// </summary>
        [DataMember(Name = "tags", EmitDefaultValue = false)]
        public List<ModDataGetEntries200ResponseEntriesInnerTagsInner> Tags { get; set; }

        /// <summary>
        /// Time of creation.
        /// </summary>
        /// <value>Time of creation.</value>
        [DataMember(Name = "timecreated", EmitDefaultValue = false)]
        public int Timecreated { get; set; }

        /// <summary>
        /// Time of last modification.
        /// </summary>
        /// <value>Time of last modification.</value>
        [DataMember(Name = "timemodified", EmitDefaultValue = false)]
        public int Timemodified { get; set; }

        /// <summary>
        /// Time of last renderization.
        /// </summary>
        /// <value>Time of last renderization.</value>
        [DataMember(Name = "timerendered", EmitDefaultValue = false)]
        public int Timerendered { get; set; }

        /// <summary>
        /// Page title.
        /// </summary>
        /// <value>Page title.</value>
        [DataMember(Name = "title", EmitDefaultValue = false)]
        public string Title { get; set; }

        /// <summary>
        /// ID of the user that last modified the page.
        /// </summary>
        /// <value>ID of the user that last modified the page.</value>
        [DataMember(Name = "userid", EmitDefaultValue = false)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModWikiGetSubwikiPages200ResponsePagesInner {\n");
            sb.Append("  Cachedcontent: ").Append(Cachedcontent).Append("\n");
            sb.Append("  Caneditpage: ").Append(Caneditpage).Append("\n");
            sb.Append("  Contentformat: ").Append(Contentformat).Append("\n");
            sb.Append("  Contentsize: ").Append(Contentsize).Append("\n");
            sb.Append("  Firstpage: ").Append(Firstpage).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Pageviews: ").Append(Pageviews).Append("\n");
            sb.Append("  Readonly: ").Append(Readonly).Append("\n");
            sb.Append("  Subwikiid: ").Append(Subwikiid).Append("\n");
            sb.Append("  Tags: ").Append(Tags).Append("\n");
            sb.Append("  Timecreated: ").Append(Timecreated).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Timerendered: ").Append(Timerendered).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Userid: ").Append(Userid).Append("\n");
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
